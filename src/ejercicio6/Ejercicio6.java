package ejercicio6;

public class Ejercicio6 {
    public static void mostrarInparesF() {
        System.out.println("Los numeros inpares (1-100) son: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void mostrarParesF(){
        System.out.println("Los numeros pares (1-100) son: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
