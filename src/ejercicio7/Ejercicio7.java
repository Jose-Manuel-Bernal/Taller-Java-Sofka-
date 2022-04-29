package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero mayor a 0:");
            numero = lector.nextInt();
        }
        while (numero<0);
        System.out.println("Introdujo el : "+ numero);
    }
    public static void introducirNumeroMayorQueCero (){

    }
}
