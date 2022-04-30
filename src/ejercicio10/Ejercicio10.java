package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void eliminarExpacios(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca el texto:");
        String texto = lector.nextLine();
        texto = texto.replaceAll(" ","");
        System.out.println(texto);
    }
}
