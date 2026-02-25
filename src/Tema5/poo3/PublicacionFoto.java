package Tema5.poo3;

public class PublicacionFoto implements PublicacionConReaccion, AbrirPublicacion {
    private String nombreArchivo;

    public PublicacionFoto() {
    }

    public PublicacionFoto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() { return nombreArchivo; }
    public void setNombreArchivo(String nombreArchivo) { this.nombreArchivo = nombreArchivo; }

    @Override
    public void publicar() {
        System.out.println("Subiendo imagen al servidor y publicando: " + nombreArchivo);
    }

    @Override
    public void compartir() {
        System.out.println("Has compartido una foto por mensaje directo.");
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo la foto '" + nombreArchivo + "' a pantalla completa en la galería.");
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Nuevo comentario en tu foto: " + comentario);
    }
}