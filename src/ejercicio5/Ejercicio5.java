package ejercicio5;


public class Ejercicio5 {
    public static void mostrarInparesW() {
        int i = 1;
        System.out.println("Los numeros impares (1-100) son: ");
        while (i<=100){
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void mostrarParesW(){
        int i = 1;
        System.out.println("Los numeros pares (1-100) son: ");
        while (i<=100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
