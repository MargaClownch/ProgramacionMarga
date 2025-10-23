package Tema2;
import java.util.Scanner;
import java.util.Random;

public class ExamenPelea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random randy = new Random();
        boolean fin = false;
        int vidaIA = 100;
        int ataqueIA = 100;
        int velocidadIA = 100;
        int defensaIA = 100;
        int vida = 0;
        int ataque = 0;
        int velocidad = 0;
        int defensa = 0;

        while (!fin) {
            System.out.println("Introduce la vida (1-200): ");
            vida = sc.nextInt();
            System.out.println("Introduce el ataque (1-200): ");
            ataque = sc.nextInt();
            System.out.println("Introduce la velocidad (1-200): ");
            velocidad = sc.nextInt();
            System.out.println("Introduce la defensa (1-200): ");
            defensa = sc.nextInt();
            if (vida + ataque + velocidad + defensa > 500) {
                System.out.println("Has superado el límite de atributos permitidos (500)");
                if (vida > 200) {
                    System.out.println("Has superado el límite de atributos permitidos (200)");
                }
                if (ataque > 200) {
                    System.out.println("Has superado el límite de atributos permitidos (200)");
                }
                if (velocidad > 200) {
                    System.out.println("Has superado el límite de atributos permitidos (200)");
                }
                if (defensa > 200) {
                    System.out.println("Has superado el límite de atributos permitidos (200)");
                }
            }
            System.out.println("Tu vida es: " + vida + " La vida de tu rival es: " + vidaIA);
            System.out.println("Tu ataque es: " + ataque + " El ataque de tu rival es: " + ataqueIA);
            System.out.println("Tu velocidad es: " + velocidad + " La velocidad de tu rival es: " + velocidadIA);
            System.out.println("Tu defensa es: " + defensa + " La defensa de tu rival es: " + defensaIA);
            System.out.println("Presiona cualquier tecla para pelear!!");
            sc.nextLine();
            String siguiente = sc.nextLine();
            while (vida >0 && vidaIA >0){
                if (velocidad > velocidadIA) {
                    System.out.println("Atacas al rival");
                    vidaIA = (vidaIA - ((ataque + randy.nextInt(20) - randy.nextInt(20)) - (defensaIA/2)));
                    System.out.println("Tu vida: " + vida + " Vida de tu rival: " + vidaIA);
                    System.out.println("El rival te ataca");
                    vida = (vida - ((ataqueIA + randy.nextInt(20) - randy.nextInt(20) - (defensa/2))));
                    System.out.println("Tu vida: " + vida + " Vida de tu rival: " + vidaIA);
                    System.out.println("Presiona cualquier tecla para pelear!!");
                    sc.nextLine();
                    String siguiente1= sc.nextLine();
                }else System.out.println("El rival te ataca");
                vida = (vida - ((ataqueIA + randy.nextInt(20) - randy.nextInt(20) - (defensa/2))));
                System.out.println("Tu vida: " + vida + " Vida de tu rival: " + vidaIA);
                System.out.println("Atacas al rival");
                vidaIA = (vidaIA - ((ataque + randy.nextInt(20) - randy.nextInt(20) - (defensaIA/2))));
                System.out.println("Tu vida: " + vida + " Vida de tu rival: " + vidaIA);
                System.out.println("Presiona cualquier tecla para pelear!!");
                sc.nextLine();
                String siguiente1= sc.nextLine();
            }
            if (vida>vidaIA){
                System.out.println("Has ganado!!");
                fin = true;
            }else
                System.out.println("Nadie se esperaba que ganases");
            fin = true;
        }
    }
}
