package ejercicio11;

import java.util.Scanner;

public class Ejercicio10 {

    public static void numeroDeVocales(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca el texto: ");
        String texto = lector.nextLine();
        System.out.println("El texto tiene un largo de: "+texto.length());
        texto = texto.toLowerCase();
        int a=0, e=0, i=0, o=0, u=0;
        for (int x=0; x<texto.length(); x++){
            char vocal = texto.charAt(x);
            switch (vocal){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:break;
            }
        }
        System.out.println("El texto contiene:"+"\n"+
                "a = "+ a + "\n"+
                "e = "+ e + "\n"+
                "i = "+ i + "\n"+
                "o = "+ o + "\n"+
                "u = "+ u);
    }
}
