package Ejercicios1ev;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Constante de gravitación universal (G), final indica que no cambia de valor
        final double G = 6.6743e-11;

        System.out.println("--- CÁLCULO DE LA FUERZA GRAVITATORIA ---");
        
        // Pedimos datos
        System.out.print("Introduce la masa 1 (en kg): ");
        double m1 = entrada.nextDouble();

        System.out.print("Introduce la masa 2 (en kg): ");
        double m2 = entrada.nextDouble();

        System.out.print("Introduce la distancia entre las masas (en metros): ");
        double distancia = entrada.nextDouble();

        // Formula
        double fuerza = G * (m1 * m2) / Math.pow(distancia, 2);

        System.out.printf("Fuerza gravitatoria (F): %.5e Newtons\n", fuerza);


        entrada.close();
    }
}