package ejercicio13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ejercicio13 {

    public static void obtenerFechaHoraActual(){
        LocalTime horaActual = LocalTime.now();
        LocalDate fechaActual = LocalDate.now();
        LocalDateTime fechaHoraActuales = LocalDateTime.now();
        System.out.println("Fecha : "+fechaActual+"\nHora : "+horaActual);
    }
}
