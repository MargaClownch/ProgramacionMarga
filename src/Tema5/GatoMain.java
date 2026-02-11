package Tema5;

public class GatoMain {
    public static void main(String[] args) {

        // Gato válido
        try {
            System.out.println("Creando a Diana...");
            Gato g1 = new Gato("Diana", 5);
            g1.imprimir();
        } catch (Exception e) {
            System.out.println("Error al crear g1: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("---Separador---");
        // Nombre corto
        try {
            System.out.println("Creando a un gato con nombre corto...");
            Gato g2 = new Gato("Diana", 3);
            g2.setNombre("Di"); // Preguntarle a Ana en clase cómo arreglar este problema
            g2.imprimir();
        } catch (Exception e) {
            System.out.println("Error al crear g2: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("---Separador---");
        // Edad negativa
        try {
            System.out.println("Creando gato y cambiando edad a negativa...");
            Gato g3 = new Gato("Marga", 2);
            g3.setEdad(-1); // Preguntarle a Ana en clase cómo arreglar este problema
        } catch (Exception e) {
            System.out.println("Error con g3: " + e.getMessage());
            e.printStackTrace();
        }
    }
}