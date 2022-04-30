package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void imprimirNumerosEnSaldosDeDos(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        int numero = lector.nextInt();
        if (numero > 1000){
            System.out.println("El numero es mayo que 1000");
        }
        while (numero<=1000){
            System.out.print(numero+", ");
            numero = numero+2;
        }
    }
}
