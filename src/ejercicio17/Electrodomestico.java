package ejercicio17;

public class Electrodomestico {
    protected int precioBase;
    protected final int PRECIO_POR_DEFECTO = 100;
    protected int peso;
    protected final int PESO_POR_DEFECTO = 5;
    protected String color;
    protected final String COLOR_POR_DEFECTO = "blanco";
    protected char consumoEnergetico;
    protected final char CONSUMO_POR_DEFECTO = 'F';

    public Electrodomestico(){
        precioBase = PRECIO_POR_DEFECTO;
        peso = PESO_POR_DEFECTO;
        color = COLOR_POR_DEFECTO;
        consumoEnergetico = CONSUMO_POR_DEFECTO;
    }

    public Electrodomestico(int precio, int peso){
        this.precioBase = precio;
        this.peso = peso;
        consumoEnergetico = CONSUMO_POR_DEFECTO;
        color = COLOR_POR_DEFECTO;
    }

    public Electrodomestico(int precio, int peso, String color, char consumo){
        this.precioBase = precio;
        this.peso = peso;
        this.consumoEnergetico = comprovarConsumo(consumo);
        this.color = comprovarColor(color);
    }

    public char comprovarConsumo(char consumo){
        if (consumo == 'A' || consumo == 'B' || consumo == 'C' || consumo == 'D' || consumo == 'F'){
            return consumo;
        }
        else {
            return CONSUMO_POR_DEFECTO;
        }
    }

    public String comprovarColor(String color){
        color = color.toLowerCase();
        if (color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris"){
            return color;
        }
        else {
            return COLOR_POR_DEFECTO;
        }
    }
    public int precioFinal(){
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
        return this.precioBase+cargoConsumo+cargoPeso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
}
