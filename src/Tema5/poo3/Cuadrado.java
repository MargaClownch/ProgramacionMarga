package Tema5.poo3;

public class Cuadrado extends Rectangulo {

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public String toString() {
        return "Cuadrado [Lado: " + getBase() + " | Área: " + area() + ", Perímetro: " + perimetro() + "]";
    }
}