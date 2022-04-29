package ejercicio3;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio3 {
    /*public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String radio;
        System.out.println("Introduce el radio del circulo: ");
        radio = lector.nextLine();
        double nradio = Math.PI*Math.pow(Double.parseDouble(radio),2);
        System.out.println("Area: "+nradio);
    }*/

    public static void hallarAreaCirculo() {
        Scanner lector = new Scanner(System.in);
        String radio;
        System.out.println("Introduce el radio del circulo: ");
        radio = lector.nextLine();
        double nradio = Math.PI*Math.pow(Double.parseDouble(radio),2);
        System.out.println("Area: "+nradio);
    }
}
