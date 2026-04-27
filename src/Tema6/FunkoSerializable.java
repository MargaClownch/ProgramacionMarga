package Tema6;
import java.io.Serializable;
import java.time.LocalDate;

public class FunkoSerializable implements Serializable {
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private LocalDate fechaLanzamiento;

    public FunkoSerializable(String cod, String nombre, String modelo, double precio, LocalDate fechaLanzamiento) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Funko [" + cod.substring(0, 8) + "...] " + nombre + " | Modelo: " + modelo + " | Precio: " + precio + "€ | Lanzamiento: " + fechaLanzamiento;
    }

    public String getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}

