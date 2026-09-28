package Ejercicios1ev;

public class Ejercicio5 {
	public static void main(String[] args) {
        // Encabezado de la tabla según la imagen
        System.out.println("---------------------------------------------------------");
        System.out.println("                TABLA DE VERDAD DE LOS");
        System.out.println("                  OPERADORES LÓGICOS");
        System.out.println("---------------------------------------------------------");
        System.out.println("|           |           |    and    |    or     |    xor    |");
        System.out.println("---------------------------------------------------------");

        // Valores posibles para las variables booleanas
        boolean[] valores = {true, false};

        // Bucles para generar todas las combinaciones (true/true, true/false, etc.)
        for (boolean p : valores) {
            for (boolean q : valores) {
                // Generación de resultados usando expresiones lógicas de Java
                boolean andRes = p && q;
                boolean orRes = p || q;
                boolean xorRes = p ^ q;

                // Imprimir la fila con formato alineado y líneas divisorias
                System.out.printf("| %-9s | %-9s | %-9s | %-9s | %-9s |\n", 
                                  p, q, andRes, orRes, xorRes);
            }
        }
        
        System.out.println("---------------------------------------------------------");
    }
}