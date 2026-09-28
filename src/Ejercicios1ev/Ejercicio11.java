package Ejercicios1ev;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Solicitamos el sueldo base
        System.out.print("Introduce el sueldo base del vendedor: ");
        double sueldoBase = entrada.nextDouble();

        // 2. Solicitamos el importe de las tres ventas realizadas este mes
        System.out.print("Introduce el importe de la primera venta: ");
        double venta1 = entrada.nextDouble();

        System.out.print("Introduce el importe de la segunda venta: ");
        double venta2 = entrada.nextDouble();

        System.out.print("Introduce el importe de la tercera venta: ");
        double venta3 = entrada.nextDouble();

        // 3. Calculamos la comisión de cada venta (10% -> multiplicar por 0.10)
        double comision1 = venta1 * 0.10;
        double comision2 = venta2 * 0.10;
        double comision3 = venta3 * 0.10;

        // 4. Calculamos la comisión total y el sueldo total
        double comisionTotal = comision1 + comision2 + comision3;
        double sueldoTotal = sueldoBase + comisionTotal;

        // 5. Mostramos los resultados detallados con formato de 2 decimales
        System.out.println("\n-----------------------------------------");
        System.out.println("           RESUMEN DE NÓMINA           ");
        System.out.println("-----------------------------------------");
        System.out.printf("Comisión venta 1 (10%%): %.2f €\n", comision1);
        System.out.printf("Comisión venta 2 (10%%): %.2f €\n", comision2);
        System.out.printf("Comisión venta 3 (10%%): %.2f €\n", comision3);
        System.out.println("-----------------------------------------");
        System.out.printf("Comisión total:         %.2f €\n", comisionTotal);
        System.out.printf("Sueldo base:            %.2f €\n", sueldoBase);
        System.out.println("-----------------------------------------");
        System.out.printf("SUELDO TOTAL A COBRAR:  %.2f €\n", sueldoTotal);
        System.out.println("-----------------------------------------");

        entrada.close();
    }
}