package Tema5.poo3;

public class PublicacionVideo implements PublicacionConReaccion, AbrirPublicacion {
    private String urlVideo;

    public PublicacionVideo() {
    }

    public PublicacionVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getUrlVideo() { return urlVideo; }
    public void setUrlVideo(String urlVideo) { this.urlVideo = urlVideo; }

    @Override
    public void publicar() {
        System.out.println("Procesando calidad HD y publicando vídeo: " + urlVideo);
    }

    @Override
    public void compartir() {
        System.out.println("Has compartido un vídeo en tus historias.");
    }

    @Override
    public void abrir() {
        System.out.println("Cargando el reproductor multimedia para ver el vídeo...");
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Nuevo comentario en tu vídeo: " + comentario);
    }
}