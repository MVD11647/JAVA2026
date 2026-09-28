package Ejercicios1ev;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce la cantidad de € que quieres convertir: ");
		double euros = entrada.nextDouble();
		double tasaCambio = 1.14;
		double dolares = euros * tasaCambio;
		System.out.printf("Tienes %.2f dolares.\n", dolares);
		
		entrada.close();
	}

}
