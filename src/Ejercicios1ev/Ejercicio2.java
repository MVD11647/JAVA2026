package Ejercicios1ev;

public class Ejercicio2 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3, d = 3;

        // Opción 1:
        boolean expr1 = (a < b) || (c != d);

        // Opción 2:
        boolean expr2 = !((a >= b) && (c == d));

        System.out.println("Expresión 1: " + expr1);
        System.out.println("Expresión 2: " + expr2);
    }
}