package Ejercicios1ev;

public class Ejercicio3 {

	public static void main(String[] args) {
		int año = 2028;
		
		boolean bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
		
		System.out.println(año +" es un año bisiesto: " + bisiesto);

	}

}
