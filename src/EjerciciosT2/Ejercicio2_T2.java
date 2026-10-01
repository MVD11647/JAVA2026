package EjerciciosT2;
/*3.Crea un método que acepte un número entero y retorne true si es par o false si es impar. 
Finalmente, escribe un programa que lo ponga a prueba. */

import java.util.Scanner;

public class Ejercicio2_T2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int numero = in.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");
		
		in.close();
		
	
	
	}

}
