package Ejercicios1ev;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		//Aplicamos la formula del MRUA
		double velocidadInicial = 5.0; // en m/s
        double aceleracion = 2.0;       // en m/s^2

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el tiempo transcurrido en segundos: ");
        double tiempo = scanner.nextDouble();

        // Aplicamos la fórmula del espacio recorrido: s = v0 * t + (1/2) * a * t^2
        double espacio = (velocidadInicial * tiempo) + (0.5 * aceleracion * Math.pow(tiempo, 2));

        // Mostramos el resultado formateado con dos decimales
        System.out.printf("Para un tiempo de %.2f segundos, el espacio recorrido es: %.2f metros.\n", tiempo, espacio);

        scanner.close();
	}
}
