package Tema5.Colecciones2;
import java.util.Random;

public class SerpienteAnillas {
    private int edad;
    private String cuerpo;
    private boolean viva;
    private Random rand;
    public static final int EDAD_BASE = 0;
    public static final String CUERPO_BASE = "";

    public SerpienteAnillas(){
        this.rand = new Random();
        this.edad = EDAD_BASE;
        this.cuerpo = CUERPO_BASE;
        this.cuerpo = generarColorAleatorio() + cuerpo;
        this.viva = true;
    }

    @Override
    public String toString(){
        return "Serpiente con cuerpo " + cuerpo + " y edad " + edad;
    }

    public void vivirUnAnio(boolean enNido) {
        if (!viva) {
            return; // Si ya está muerta no hace nada
        }

        this.edad++;

        // Si no está en un nido tiene un 10% de probabilidad de morir por el ataque de una mangosta
        if (!enNido) {
            if (rand.nextInt(100) < 10) {
                this.viva = false;
                this.cuerpo = "";
                return;
            }
        }

        // Si es joven menos de 10 años
        if (this.edad < 10) {
            int probabilidad = rand.nextInt(100);
            if (probabilidad < 80) {
                // Crece
                this.cuerpo = this.cuerpo + generarColorAleatorio();
            } else {
                // Muda la piel
                mudarPiel();
            }
        }
        // Si es mayor 10 años o más
        else {
            int probabilidad = rand.nextInt(100);
            if (probabilidad < 90) {
                // Decrece
                this.cuerpo = this.cuerpo.substring(0, this.cuerpo.length() - 1);
            } else {
                // Muda la piel
                mudarPiel();
            }
        }

        // Comprobación de muerte natural
        if (this.cuerpo.isEmpty()) {
            this.viva = false;
        }
    }
    private char generarColorAleatorio() {
        char[] colores = {'r', 'v', 'a'};
        return colores[rand.nextInt(3)];
    }
    private void mudarPiel() {
        String nuevoCuerpo = "";
        for (int i = 0; i < this.cuerpo.length(); i++) {
            nuevoCuerpo = nuevoCuerpo + generarColorAleatorio();
        }
        this.cuerpo = nuevoCuerpo;
    }

    public int getEdad() {
        return edad;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public boolean isViva() {
        return viva;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }
}
