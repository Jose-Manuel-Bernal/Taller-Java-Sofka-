package ejercicio16;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private final char SEXO_POR_DEFECTO = 'M';
    private double peso;
    private double altura;
    private final int MENOR_QUE_20 = -1;
    private final int ENTRE_20_Y_25 = 0;
    private final int MAYOR_QUE_25 = -1;

    public Persona(){
        nombre = "";
        DNI = crearDNI();
        edad = 0;
        sexo = SEXO_POR_DEFECTO;
        peso = 0.0;
        altura = 0.0;
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        DNI = crearDNI();
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        peso = 0.0;
        altura = 0.0;
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        DNI = crearDNI();
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    private String crearDNI(){
        int dni = rangoRandom(10000000, 99999999);
        String newDNI = "";
        newDNI = String.valueOf(dni);
        return newDNI;
    }

    private static int rangoRandom(int min, int max){
        return new Random().nextInt(max+1 - min);
    }

    private char comprobarSexo (char sexo){
        if (sexo == 'F'){
            return sexo;
        }
        else {
            return SEXO_POR_DEFECTO;
        }
    }

    public int calcularIMC(){
        int imc = (int)(peso/(Math.pow(altura,2)));
        int resultado = -1;
        if (imc < 20){
            resultado = MENOR_QUE_20;
        }
        if (imc >= 20 && imc <=25){
            resultado = ENTRE_20_Y_25;
        }
        if (imc > 25){
            resultado = MAYOR_QUE_25;
        }
        return resultado;
    }

    public boolean esMayorDeEdad(){
        boolean flag = false;
        if (edad >= 18){
            flag = true;
        }
        return flag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
