package Tema2;
import java.util.Scanner;
import java.util.Random;

public class ExamenPelea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randy = new Random();
        boolean fin = false;
        int total = 500;
        int vidaIA = 0;
        int defensaIA = 0;
        int ataqueIA = 0;
        int velocidadIA = 0;
        int vidaMax = 0;
        int ataque = 0;
        int velocidad = 0;
        int defensa = 0;

        do {
            vidaIA = 50 + randy.nextInt(151);
            defensaIA = 50 + randy.nextInt(151);
            ataqueIA = 50 + randy.nextInt(151);
            velocidadIA = total - (vidaIA + defensaIA + ataqueIA);
        } while (velocidadIA < 50 || velocidadIA > 200);


        while (vidaMax + ataque + velocidad + defensa != 500) {
            System.out.println("Tus atributos tienen que sumar 500 en total");
            System.out.println("Introduce la vida (1-200): ");
            vidaMax = sc.nextInt();
            System.out.println("Introduce el ataque (1-200): ");
            ataque = sc.nextInt();
            System.out.println("Introduce la velocidad (1-200): ");
            velocidad = sc.nextInt();
            System.out.println("Introduce la defensa (1-200): ");
            defensa = sc.nextInt();

            if (vidaMax + ataque + velocidad + defensa > 500) {
                System.out.println("Has superado el límite de atributos permitidos (500)");
                if (vidaMax > 200) {
                    System.out.println("Has superado el límite de Vida permitida (200)");
                }
                if (ataque > 200) {
                    System.out.println("Has superado el límite de ataque permitido (200)");
                }
                if (velocidad > 200) {
                    System.out.println("Has superado el límite de velocidad permitida (200)");
                }
                if (defensa > 200) {
                    System.out.println("Has superado el límite de defensa permitida (200)");
                }

            }
        }
            System.out.println("Tu vida es: " + vidaMax + " La vida de tu rival es: " + vidaIA);
            System.out.println("Tu ataque es: " + ataque + " El ataque de tu rival es: " + ataqueIA);
            System.out.println("Tu velocidad es: " + velocidad + " La velocidad de tu rival es: " + velocidadIA);
            System.out.println("Tu defensa es: " + defensa + " La defensa de tu rival es: " + defensaIA);
            System.out.println("Tu total de atributos es: " + (vidaMax + ataque + velocidad + defensa) + " Los atributos de tu rival son: " + (vidaIA + ataqueIA + velocidadIA + defensaIA));
            System.out.println("Presiona cualquier tecla para pelear!!");
            sc.nextLine();
            String siguiente = sc.nextLine();
            while (vidaMax > 0 && vidaIA > 0) {
                int danio = ataque - defensaIA;
                int danioIA = ataqueIA - defensa;

                if (velocidad > velocidadIA) {
                    System.out.println("Atacas al rival");
                    if (danio <= 0) {
                        vidaIA -= 5;
                    } else
                        vidaIA -= danio;
                    if (vidaIA < 0) vidaIA = 0;


                    System.out.println("Tu vida: " + vidaMax + " Vida de tu rival: " + vidaIA);
                    System.out.println("El rival te ataca");
                    if (danioIA <= 0) {
                        vidaMax -= 5;
                    } else
                        vidaMax -= danioIA;
                    if (vidaMax < 0) vidaMax = 0;


                    System.out.println("Tu vida: " + vidaMax + " Vida de tu rival: " + vidaIA);
                    System.out.println("Presiona ENTER para pelear!!");
                    String siguiente1 = sc.nextLine();
                } else System.out.println("El rival te ataca");
                if (danioIA <= 0) {
                    vidaMax -= 5;
                } else
                    vidaMax -= danioIA;
                if (vidaMax < 0) vidaMax = 0;


                System.out.println("Tu vida: " + vidaMax + " Vida de tu rival: " + vidaIA);
                System.out.println("Atacas al rival");
                if (danio <= 0) {
                    vidaIA -= 5;
                }else
                    vidaIA -= danio;
                if (vidaIA < 0) vidaIA = 0;

                System.out.println("Tu vida: " + vidaMax + " Vida de tu rival: " + vidaIA);
                System.out.println("Presiona ENTER para pelear!!");
                String siguiente2 = sc.nextLine();

            if (vidaMax > vidaIA) {
                System.out.println("Has ganado!!");
            } else
                System.out.println("Nadie se esperaba que ganases");
        }
    }
}

