package Tema4;

public class PersonaMain {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona2 = new Persona("D00000000","Diana","Vatafu",27);
        persona.isAdult();
        persona2.isAdult();
        persona.isRetired();
        persona2.isRetired();
        persona.ageDiference(13);
        Persona.checkDNI("Y00000000");
        System.out.println(persona);
        System.out.println(persona2);
    }
}
