package Ejercicios1ev;

import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Radio de la Tierra en kilómetros dado por el enunciado
        final double RADIO_TIERRA = 6371.01;

        System.out.println("--- CÁLCULO DE DISTANCIA ENTRE DOS PUNTOS TERRESTRES ---");
        
        // Solicitamos las coordenadas del Punto 1 (P1)
        System.out.println("\n--- Coordenadas del Punto 1 (P1) ---");
        System.out.print("Introduce la latitud de P1 (en grados): ");
        double lat1Grados = entrada.nextDouble();
        System.out.print("Introduce la longitud de P1 (en grados): ");
        double lon1Grados = entrada.nextDouble();

        // Solicitamos las coordenadas del Punto 2 (P2)
        System.out.println("\n--- Coordenadas del Punto 2 (P2) ---");
        System.out.print("Introduce la latitud de P2 (en grados): ");
        double lat2Grados = entrada.nextDouble();
        System.out.print("Introduce la longitud de P2 (en grados): ");
        double lon2Grados = entrada.nextDouble();

        // Convertimos los grados a radianes como exige la clase Math de Java
        double lat1 = Math.toRadians(lat1Grados);
        double lon1 = Math.toRadians(lon1Grados);
        double lat2 = Math.toRadians(lat2Grados);
        double lon2 = Math.toRadians(lon2Grados);

        // Aplicamos la fórmula del arcocoseno especificada en el enunciado
        double parteInterna = Math.sin(lat1) * Math.sin(lat2) + 
                              Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon2 - lon1);
        
        // Calculamos la distancia total multiplicando por el radio de la Tierra
        double distancia = RADIO_TIERRA * Math.acos(parteInterna);

        // Mostramos el resultado con una precisión de 3 decimales
        System.out.println("\n---------------------------------------------------------");
        System.out.printf("La distancia entre los dos puntos es: %.3f km\n", distancia);
        System.out.println("---------------------------------------------------------");

        entrada.close();
    }
}