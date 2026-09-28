package Ejercicios1ev;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cómo te llamas? ");
        
        //Guarda el momento exacto (en milisegundos) antes de que el usuario responda
        long inicio = System.currentTimeMillis();
        
        //Esperar a que el usuario introduzca su nombre y pulse Enter
        String nombre = scanner.nextLine();
        
        //Guarda el momento exacto en que termina de responder
        long fin = System.currentTimeMillis();
        
        long tiempoTotalMs = fin - inicio;
        double segundos = tiempoTotalMs / 1000.0;
        
        System.out.println("¡Encantado de conocerte, " + nombre + "!");
        System.out.printf("Has tardado %.3f segundos en contestar.\n", segundos);
        
        scanner.close();
    }
}