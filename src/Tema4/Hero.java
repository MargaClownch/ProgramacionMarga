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
    public static final int POTIONHEALING = 10;
    public static final int RESTHEALING = 50;
    public static final int LEVELUP = 50;
    Random rand = new Random();

    // Constructores

    public Hero(){
        this.name = "Enemigo";
        this.level = 1;
        this.health = 30;
        this.maxHealth = 30;
        this.experience = 0;
        this.attack = 5;
        this.defense = 5;
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

    public int drinkPotion(){
        return this.health + POTIONHEALING;
    }
    public int rest(){
        return this.health + RESTHEALING;
    }
    public String toString(){
        return this.name + " " + this.level + " " + this.health + " " + this.maxHealth + " " + this.experience + " " + this.attack + " " + this.defense;
    }
    public void levelUP(){
        this.level = this.level + 1;
        this.maxHealth = this.maxHealth + 5;
        this.attack = this.attack + 1;
        this.defense = this.defense + 1;
    }
    public void attack(Hero h){
        h.health = h.health - (rand.nextInt(this.attack) - h.defense + 1);
        this.experience = this.experience + 10;
        if(this.experience >= LEVELUP){
            this.experience = this.experience - LEVELUP;
            levelUP();
        }
        System.out.println("He atacado");
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
