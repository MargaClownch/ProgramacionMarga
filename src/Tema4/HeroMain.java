package Tema4;
import java.util.Random;
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int wave = 0;
        Hero heroe = new Hero("Marga",1,30,30,0,30,0);

        System.out.println("Comienza el juego!! Sí tu personaje tiene estadisticas predeterminadas recuerda cambiarlo dentro del objeto Hero!");
        System.out.println("Tu personaje es " + heroe);

        // Bucle principal
        while(heroe.getHealth()>0) {
            wave++;
            System.out.println("Llega la oleada número " + wave );

            // Aquí se generan los enemigos
            int enemy = rand.nextInt(3) + 1;
            Hero[] enemies = new Hero[enemy];
            for (int i = 0; i < enemies.length;i++){
                enemies[i] = new Hero("Goblin " + (i + 1), 1, 15, 15, 0, 7, 2);
            }
            System.out.println("Han aparecido " + enemy + " enemigos");
            boolean enemiesAlive = true;

            // Bucle de rondas
            while (heroe.getHealth()>0 && enemiesAlive) {

                // Sí los enemigos están vivos y sale el 10% huyen de la batalla
                for (int i = 0; i < enemies.length; i++) {
                    if (enemies[i].getHealth() > 0) {
                        if (rand.nextInt(10) == 0) {
                            System.out.println("El goblin ha huido ante tu temible presencia");
                            enemies[i].setHealth(0);
                        }
                    }
                }

                // Ataque del jugador
                boolean turnAttack = false;
                for (int i = 0; i < enemies.length; i++) {
                    if (enemies[i].getHealth() > 0) {
                        System.out.println("Atacas a " + enemies[i].getName());
                        heroe.attack(enemies[i]);
                        turnAttack = true;
                        break;
                    }
                }
                enemiesAlive = false;

                // Ataque del Goblin
                for (int i = 0; i < enemies.length; i++) {
                    if (enemies[i].getHealth() > 0) {
                        enemiesAlive = true;
                        System.out.println(enemies[i].getName() + " te ataca");
                        enemies[i].attack(heroe);
                    }
                }
                // Barra de vida super simple porque no me acuerdo de la otra
                if (heroe.getHealth() > 0 && enemiesAlive) {
                    System.out.println("   [Tu Vida: " + heroe.getHealth() + "/" + heroe.getMaxHealth() + "]");
                }
            }
                // Sí se resuelven los bucles anteriores se revisa que el heroe siga vivo y se aplican las habilidades
                if (heroe.getHealth() > 0) {
                    System.out.println("Horda eliminada");

                    // Probabilidad de encontrar una poción
                    if (rand.nextInt(100) < 10) {
                        System.out.println("Has encontrado una poción entre los cadáveres");
                        heroe.drinkPotion();
                    }

                    // Probabilidad de descansar
                    if (rand.nextInt(1000) == 0) {
                        System.out.println("Encuentras un lugar seguro y descansas");
                        heroe.rest();
                    }
                }
            }
        System.out.println("GAME OVER");
        System.out.println("Has sobrevivido a " + (wave - 1) + " hordas completas.");
        System.out.println("Tu héroe murió luchando con honor.");
    }
}

