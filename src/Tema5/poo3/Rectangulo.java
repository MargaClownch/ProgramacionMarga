package Tema5.poo3;

public class Rectangulo extends Figura2D {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (base * 2) + (altura * 2);
    }

    @Override
    public String toString() {
        return "Rectángulo [Base: " + base + ", Altura: " + altura + " | Área: " + area() + ", Perímetro: " + perimetro() + "]";
    }
}