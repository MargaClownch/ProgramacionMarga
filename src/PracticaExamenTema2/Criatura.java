package PracticaExamenTema2;

public abstract class Criatura {
    // Atributos privados
    private String nombre;
    private int nivel;
    private int psMax;
    private int psActual;
    private int ataque;
    private int defensa;

    // Constructor con lo básico
    public Criatura(String nombre, int nivel, int psMax, int ataque, int defensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.psMax = psMax;
        this.psActual = psMax; // Al nacer, la vida actual es la máxima
        this.ataque = ataque;
        this.defensa = defensa;
    }

    // Métodos obligatorios
    public boolean estaDebilitada() {
        return psActual <= 0; // true si psActual <= 0
    }

    public void curarCompleto() {
        this.psActual = this.psMax;
    }

    public void recibirDanio(int cantidad) {
        this.psActual -= cantidad;
        if (this.psActual < 0) {
            this.psActual = 0; // resta, sin bajar de 0
        }
    }
    @Override
    public String toString() {
        // Ejemplo: "Pika [ELECTRICO] Nv.5 PS 18/18 ATK 7 DEF 4"
        return nombre + " [" + getTipo() + "] Nv." + nivel + " PS " + psActual + "/" + psMax + " ATK " + ataque + " DEF " + defensa;
    }

    // Métodos abstractos que las hijas tendrán que rellenar
    public abstract String getTipo();
    public abstract int atacar(Criatura objetivo);

    // Getters y Setters básicos necesarios
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public int getAtaque() { return ataque; }
    public void setAtaque(int ataque) { this.ataque = ataque; }
    public int getDefensa() { return defensa; }
    public void setDefensa(int defensa) { this.defensa = defensa; }
    public int getPsMax() { return psMax; }
    public void setPsMax(int psMax) { this.psMax = psMax; }
    public void setPsActual(int psActual) { this.psActual = psActual; }
}