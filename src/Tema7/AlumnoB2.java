package Tema7;

class AlumnoB2 {
    private String nombre;
    private String apellido;
    private double media;

    public AlumnoB2(String nombre, String apellido, double media) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.media = media;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getMedia() {
        return media;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}