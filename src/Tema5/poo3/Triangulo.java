package Tema5.poo3;

public class Triangulo extends Figura2D {
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + base;
    }

    @Override
    public String toString() {
        return "Triángulo [Base: " + base + ", Altura: " + altura + " | Área: " + area() + ", Perímetro: " + perimetro() + "]";
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}