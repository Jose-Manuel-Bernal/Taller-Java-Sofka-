package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void concatenarFrase(){
        Scanner lector = new Scanner(System.in);
        String texto = "La sonrisa sera la mejor arma contra la tristesa";
        System.out.println(texto);
        texto = texto.replace('a','e');
        System.out.println(texto);
        System.out.println("Ingrese nuevo texto: ");
        String nuevoTexto = lector.nextLine();
        System.out.println(texto.concat(nuevoTexto));
    }
}
