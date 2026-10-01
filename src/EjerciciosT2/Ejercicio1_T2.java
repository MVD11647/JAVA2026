package EjerciciosT2;

import java.util.Scanner;

public class Ejercicio1_T2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce el valor del dividendo: ");
		double dividendo = in.nextDouble();
		
		System.out.println("Introduce el valor del divisor: ");
		double divisor = in.nextDouble();
		
		double resultado = (dividendo / divisor);
		
		if (dividendo % divisor == 0)
			System.out.println("El resultado es: " + resultado);
		else 
			System.out.println ("La division no es exacta");
		
		in.close();
		
	
	
	}

}
