package ejercicio1y2;

import java.util.Scanner;

public class Ejercicio2 {
    /*public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a,b;
        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println("Introduce el primer numero: ");
        a = lector.nextInt();
        System.out.println("Introduce el segundo numero: ");
        b = lector.nextInt();
        if (ejercicio1.esIgual(a,b)){
            System.out.println("Los numeros son iguales.");
        }
        else {
            System.out.println("El "+ejercicio1.hallarMayor(a,b)+" es el numero mayor.");
        }
    }*/
    public static void mostrarMayor(){
        int a,b;
        Scanner lector = new Scanner(System.in);
        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println("Introduce el primer numero: ");
        a = lector.nextInt();
        System.out.println("Introduce el segundo numero: ");
        b = lector.nextInt();
        if (ejercicio1.esIgual(a,b)){
            System.out.println("Los numeros son iguales.");
        }
        else {
            System.out.println("El "+ejercicio1.hallarMayor(a,b)+" es el numero mayor.");
        }
    }
}
