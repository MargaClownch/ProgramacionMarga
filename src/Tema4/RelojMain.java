package Tema4;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(14,22,55,true);
        reloj.setHora(25);
        System.out.println("La hora es: " + reloj.getHora());
        System.out.println("La hora toString es: " + reloj);
        reloj.showHora();

    }
}
