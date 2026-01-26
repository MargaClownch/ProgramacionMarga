package Tema4;

import java.util.ArrayList;

public class HeroMain {
    public static void main(String[] args) {
        final double POTIONFIND = 0.1;
        final double REST = 0.001;
        int wave = 0;
        Hero Marga = new Hero("Marga",1,100,100,0,10,10);
        Hero[] Enemigos = new Hero[3];
        Enemigos[0] = new Hero("Charly",1,25,25,0,3,2);
        Enemigos[1] = new Hero("Carlos",1,30,30,0,5,4);
        Enemigos[2] = new Hero("Samper",1,40,40,0,10,6);
        for (int i = 0; i < Enemigos.length; i++) {
            System.out.println(Enemigos[i]);
        }
    }
}

