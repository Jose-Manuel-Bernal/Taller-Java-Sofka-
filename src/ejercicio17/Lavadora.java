package ejercicio17;

public class Lavadora extends Electrodomestico{
    private int carga;
    private final int CARGA_POR_DEFECTO = 5;

    public Lavadora(){
        carga = CARGA_POR_DEFECTO;
        precioBase = PRECIO_POR_DEFECTO;
        peso = PESO_POR_DEFECTO;
        color = COLOR_POR_DEFECTO;
        consumoEnergetico = CONSUMO_POR_DEFECTO;
    }

    public Lavadora(int precio, int peso){
        this.precioBase = peso;
        this.peso = peso;
        carga = CARGA_POR_DEFECTO;
        color = COLOR_POR_DEFECTO;
        consumoEnergetico = CONSUMO_POR_DEFECTO;
    }

    public Lavadora(int carga, int precio, int peso, String color, char consumo){
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal(){
        int cargoCarga = 0;
        if (this.carga > 30){
            cargoCarga = 50;
        }
        int cargoConsumo = 0;
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
        return cargoCarga+cargoConsumo+cargoPeso;
    }
}
