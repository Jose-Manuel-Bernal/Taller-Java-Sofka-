package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void esDiaLaboral(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca dia de la semana");
        String dia = lector.nextLine();
        switch (dia){
            case "Lunes":
                System.out.println("El "+dia+" es un dia laboral");
                break;
            case "Martes":
                System.out.println("El "+dia+" es un dia laboral");
                break;
            case "Miercoles":
                System.out.println("El "+dia+" es un dia laboral");
                break;
            case "Juevez":
                System.out.println("El "+dia+" es un dia laboral");
                break;
            case "Viernes":
                System.out.println("El "+dia+" es un dia laboral");
                break;
            case "Sabado":
                System.out.println("El "+dia+" usualmente es un dia laboral");
                break;
            case "Domingo":
                System.out.println("El "+dia+" no es un dia laboral");
            default:
                System.out.println(dia+ " no es un dia de la semana");
        }
    }
}
