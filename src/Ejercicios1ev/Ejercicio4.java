package Ejercicios1ev;

public class Ejercicio4 {

	public static void main(String[] args) {
        int numeroOriginal = 5;
        int exponente = 3; // Esto representa 2^3 (que es 8)
        
        // Multiplicación usando desplazamiento de bits (equivalente a 5 * 8)
        int resultado = numeroOriginal << exponente;
        
        System.out.println("Número original: " + numeroOriginal);
        System.out.println("Potencia de 2 aplicada (2^" + exponente + "): " + (1 << exponente));
        System.out.println("Resultado de la operación: " + resultado);
    }
}
