package ejercicio15;

import javax.swing.JOptionPane;

public class Ejercicio15 {

    public static void menu(){
        char opcSelected ;
        do {
            opcSelected = mainMenu();
            switch (opcSelected){
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case '8':
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
                    break;
            }
        } while(opcSelected != '8');
    }
    public static char mainMenu() {
        char opcSelected = ' ';
        do {
            opcSelected = JOptionPane.showInputDialog(null,
                    "******GESTION CINEMATOGRAFICA******" + "\n" +
                            "1-NUEVO ACTOR" + "\n" +
                            "2-BUSCAR ACTOR" + "\n" +
                            "3-ELIMINAR ACTOR" + "\n" +
                            "4-MODIFICAR ACTOR"+ "\n" +
                            "5-VER TODOS LOS ACTORES" + "\n" +
                            "6-VER PELICULAS DE LOS ACTORES" + "\n" +
                            "7-VER CATEGORIAS DE LAS PELICULAS DE LOS ACTORES" + "\n" +
                            "8-SALIR").charAt(0);
        } while(opcSelected < '1' || opcSelected > '8');
        return opcSelected;
    }
}
