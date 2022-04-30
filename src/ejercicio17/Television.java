package ejercicio17;

public class Television extends Electrodomestico{
    private int resolucion;
    private final int RESOLUCION_POR_DEFECTO = 20;
    private boolean sincronizacionTDT;
    private final boolean SINCRONIZACION_TDT_POR_DEFECTO = false;

    public Television(){
        resolucion = RESOLUCION_POR_DEFECTO;
        sincronizacionTDT = SINCRONIZACION_TDT_POR_DEFECTO;
        precioBase = PRECIO_POR_DEFECTO;
        peso = PESO_POR_DEFECTO;
        color = COLOR_POR_DEFECTO;
        consumoEnergetico = CONSUMO_POR_DEFECTO;
    }

    public Television(int precio, int peso){
        this.precioBase = peso;
        this.peso = peso;
        resolucion = RESOLUCION_POR_DEFECTO;
        sincronizacionTDT = SINCRONIZACION_TDT_POR_DEFECTO;
        color = COLOR_POR_DEFECTO;
        consumoEnergetico = CONSUMO_POR_DEFECTO;
    }

    public Television(int resolucion, boolean sincronizacionTDT, int precio, int peso, String color, char consumo){
        super(precio, peso, color, consumo);
        this.resolucion = resolucion;
        this.sincronizacionTDT = sincronizacionTDT;
    }

    @Override
    public int precioFinal(){
        double cargoResolucion = 0;
        if (this.resolucion > 40){
            cargoResolucion = this.precioBase*0.21;
        }
        int cargoSincronizacion = 0;
        if (sincronizacionTDT){
            cargoSincronizacion = 50;
        }
        int cargoConsumo =0;
        int cargoPeso = 0;
        switch (this.consumoEnergetico){
            case 'A':
                cargoConsumo = 100;
                break;
            case 'B':
                cargoConsumo = 80;
                break;
            case 'C':
                cargoConsumo = 60;
                break;
            case 'D':
                cargoConsumo = 50;
                break;
            case 'E':
                cargoConsumo = 30;
                break;
            case 'F':
                cargoConsumo = 10;
                break;
        }
        if (this.peso < 19){
            cargoPeso = 10;
        }
        if (this.peso >= 20 && this.peso <= 49){
            cargoPeso = 50;
        }
        if (this.peso >= 50 && this.peso <= 79){
            cargoPeso = 80;
        }
        if (this.peso > 80){
            cargoPeso = 100;
        }
        return cargoConsumo+cargoPeso+(int)cargoResolucion+cargoSincronizacion;
    }

}
