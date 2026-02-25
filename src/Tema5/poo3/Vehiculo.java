package Tema5.poo3;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    public static final String MATRICULA_BASE = "0000000";
    public static final String MARCA_BASE = "Ford";
    public static final String MODELO_BASE = "A1";

    // Constructor
    public Vehiculo() {
        this.matricula = MATRICULA_BASE;
        this.marca = MARCA_BASE;
        this.modelo = MODELO_BASE;
    }

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (Matrícula: " + matricula + ")";
    }


    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}