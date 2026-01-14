package Tema4;

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
    // Constructores
    public Hero(){

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
        return name + " " + level + " " + health + " " + maxHealth + " " + experience + " " + attack + " " + defense;
    }
    public void attack(Hero h){

    }
}
