package Tema4;

public class PersonaMain {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona2 = new Persona("D00000000","Diana","Vatafu",27);

        if (persona.isAdult()){
            System.out.println("Es adulto");
        }else{
            System.out.println("No es adulto");
        }
        if (persona.isRetired()){
            System.out.println("Está retirado");
        }else{
            System.out.println("No está retirado");
        }
        persona.ageDiference(persona2);
        Persona.checkDNI("Y00000000");
        System.out.println(persona);
        System.out.println(persona2);
    }
}
