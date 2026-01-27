package Tema4;
import java.util.Random;
public class Hero {

    // Atributos

    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;
    private int damage;
    public static final String NAMEBASE = "Pepe";
    public static final int LEVELBASE = 1;
    public static final int HEALTHBASE = 20;
    public static final int MAXHEALTHBASE = 20;
    public static final int EXPERIENCEBASE = 0;
    public static final int ATTACKBASE = 10;
    public static final int DEFENSEBASE = 10;
    public static final int POTIONHEALING = 10;
    public static final int RESTHEALING = 50;
    public static final int LEVELUP = 50;
    Random rand = new Random();

    // Constructores

    public Hero(){
        this.name = NAMEBASE;
        this.level = LEVELBASE;
        this.health = HEALTHBASE;
        this.maxHealth = MAXHEALTHBASE;
        this.experience = EXPERIENCEBASE;
        this.attack = ATTACKBASE;
        this.defense = DEFENSEBASE;
    }
    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }

    // Métodos

    public void drinkPotion() {
        this.health = this.health + POTIONHEALING;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
        System.out.println(this.name + " Ha bebido una poción y se ha curado");
        System.out.println("Salud actual: " + this.health + "/" + this.maxHealth);
    }
    public void levelUP(){
        this.level = this.level + 1;
        this.maxHealth = this.maxHealth + 5;
        this.attack = this.attack + 1;
        this.defense = this.defense + 1;
    }
    public void attack(Hero h){
        damage = rand.nextInt(this.attack) - h.defense + 1;
        if (damage < 0) {
            damage = 0;
        }
        h.health = h.health - damage;
        this.experience = this.experience + 10;
        if(this.experience >= LEVELUP){
            this.experience = this.experience - LEVELUP;
            levelUP();
        }
        System.out.println("El ataque ha infligido " + damage + " de daño.");
    }
    public void rest() {
        this.health += RESTHEALING;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
        System.out.println(this.name + " se ha echado una siesta. Salud recuperada.");
        System.out.println("Salud actual: " + this.health + "/" + this.maxHealth);
    }

    //Setters y Getter

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
