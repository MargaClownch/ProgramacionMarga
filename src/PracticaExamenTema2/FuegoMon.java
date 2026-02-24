package PracticaExamenTema2;

public class FuegoMon extends Criatura implements Entrenable, Evolucionable {

    public FuegoMon(String nombre, int nivel, int psMax, int ataque, int defensa) {
        super(nombre, nivel, psMax, ataque, defensa);
    }

    @Override
    public String getTipo() {
        return "FUEGO";
    }

    @Override
    public int atacar(Criatura objetivo) {
        // 1. Calcular daño base
        double danioBase = this.getAtaque() - (objetivo.getDefensa() / 2.0);

        // 2. Mínimo 1 de daño
        if (danioBase < 1) {
            danioBase = 1;
        }

        // 3. Multiplicador de tipo usando .equals()
        double multiplicador = 1.0;
        String tipoRival = objetivo.getTipo();

        // "FUEGO" -> fuerte vs "PLANTA" (x2), débil vs "AGUA" (x0.5)
        if (tipoRival.equals("PLANTA")) {
            multiplicador = 2.0;
        } else if (tipoRival.equals("AGUA")) {
            multiplicador = 0.5;
        }

        // 4. Daño final redondeado
        int danioFinal = (int) Math.round(danioBase * multiplicador);

        // 5 y 6. Aplicar y devolver
        objetivo.recibirDanio(danioFinal);
        return danioFinal;
    }

    @Override
    public void entrenar() {
        // Sube nivel +1 y mejora stats
        this.setNivel(this.getNivel() + 1);
        this.setAtaque(this.getAtaque() + 2);
        this.setDefensa(this.getDefensa() + 1);
        this.setPsMax(this.getPsMax() + 5);
        this.curarCompleto(); // Curamos al entrenar para que sea práctico
        System.out.println(this.getNombre() + " ha entrenado y subido al nivel " + this.getNivel() + "!");
    }

    @Override
    public boolean puedeEvolucionar() {
        // Se puede evolucionar desde nivel 8
        return this.getNivel() >= 8;
    }

    @Override
    public Criatura evolucionar() {
        if (puedeEvolucionar()) {
            System.out.println("¡" + this.getNombre() + " está evolucionando!");
            // Devuelve una nueva criatura con mejores stats
            return new FuegoMon(this.getNombre() + " Evo", this.getNivel(), this.getPsMax() + 20, this.getAtaque() + 10, this.getDefensa() + 10);
        }
        return null;
    }
}