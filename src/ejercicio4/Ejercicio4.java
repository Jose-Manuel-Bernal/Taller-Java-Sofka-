package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    /*public static void main(String[] args) {
        final double IVA = 0.21;
        double precioFinal;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el valor del producto: ");
        precioFinal = lector.nextDouble();
        precioFinal = precioFinal + precioFinal*IVA;
        System.out.println("El precio final es: "+precioFinal+"$");
    }*/
    public static void hallarPrecioFinalConIVA(){
        final double IVA = 0.21;
        double precioFinal;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el valor del producto: ");
        precioFinal = lector.nextDouble();
        precioFinal = precioFinal + precioFinal*IVA;
        System.out.println("El precio final es: "+precioFinal+"$");
    }
}
