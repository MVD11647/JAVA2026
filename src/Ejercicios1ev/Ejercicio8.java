package Ejercicios1ev;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos el radio al usuario
        System.out.print("Introduce el valor del radio del círculo: ");
        double radio = scanner.nextDouble();
        
        // Cálculos usando Math.PI
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2); // También es válido: Math.PI * radio * radio
        
        // Mostramos los resultados formateados con dos decimales
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Perímetro: %.2f\n", perimetro);
        System.out.printf("Área: %.2f\n", area);
        
        scanner.close();
    }
}