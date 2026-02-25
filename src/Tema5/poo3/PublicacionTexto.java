package Tema5.poo3;

public class PublicacionTexto implements PublicacionConReaccion {
    private String contenidoTexto;

    public PublicacionTexto() {
    }

    public PublicacionTexto(String contenidoTexto) {
        this.contenidoTexto = contenidoTexto;
    }

    public String getContenidoTexto() { return contenidoTexto; }
    public void setContenidoTexto(String contenidoTexto) { this.contenidoTexto = contenidoTexto; }

    @Override
    public void publicar() {
        System.out.println("Publicando un estado: " + contenidoTexto);
    }

    @Override
    public void compartir() {
        System.out.println("Has compartido el texto de otro usuario en tu muro.");
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Nuevo comentario en tu texto: " + comentario);
    }
}