package Ejercicios1ev;

import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- CONVERSOR DE ESPACIO RGB A YIQ ---");
        
        // Solicitamos las componentes RGB
        System.out.print("Introduce el valor de la componente Roja (r): ");
        double r = entrada.nextDouble();

        System.out.print("Introduce el valor de la componente Verde (g): ");
        double g = entrada.nextDouble();

        System.out.print("Introduce el valor de la componente Azul (b): ");
        double b = entrada.nextDouble();

        // Aplicamos las fórmulas matemáticas proporcionadas
        double y = 0.299 * r + 0.587 * g + 0.114 * b;
        double i = 0.596 * r - 0.275 * g - 0.321 * b;
        double q = 0.212 * r - 0.528 * g + 0.311 * b;

        System.out.printf("Y: %.2f\n", y);
        System.out.printf("I: %.2f\n", i);
        System.out.printf("Q: %.2f\n", q);

        entrada.close();
    }
}