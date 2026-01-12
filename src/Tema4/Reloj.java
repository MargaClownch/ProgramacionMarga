package Tema4;

public class Reloj {
    // Atributos
    private int hora;
    public static final int HORABASE=0;
    private int minuto;
    public static final int MINUTOBASE=0;
    private int segundo;
    public static final int SEGUNDOBASE=0;
    private boolean ampm;
    public static final boolean AMPMBASE=true;
    // Constructores
    public Reloj(){
        this.hora = HORABASE;
        this.minuto = MINUTOBASE;
        this.segundo = SEGUNDOBASE;
        this.ampm=AMPMBASE;
    }
    public Reloj(int hora, int minuto, int segundo, boolean ampm) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.ampm = ampm;
    }
    // Métodos
    public void showHora(){
        if (!this.ampm) {
            System.out.println("Hora: " + this.hora);
            System.out.println("Minuto: " + this.minuto);
            System.out.println("Segundo: " + this.segundo);
        }
        else if (this.hora > 12) {
            System.out.println("Hora: " + this.hora + -12 + "PM");
            System.out.println("Minuto: " + this.minuto + "PM");
            System.out.println("Segundo: " + this.segundo + "PM");
        }else
            System.out.println("Hora: " + this.hora + "AM");
            System.out.println("Minuto: " + this.minuto + "AM");
            System.out.println("Segundo: " + this.segundo + "AM");
    }
    @Override
    public String toString(){
        if (!this.ampm) {
            return this.hora + ":" + this.minuto + ":" + this.segundo;
        }
        else if (this.hora > 12) {
            return this.hora-12 + ":" + this.minuto + ":" + this.segundo + " PM";
        }
        else return this.hora + ":" + this.minuto + ":" + this.segundo + " AM";
    }
    // Setters y Getters
    public int getHora(){
        return this.hora;
    }
    public void setHora(int hora){
         if (hora >= 0 && hora <= 23){
            this.hora = hora;
         }else System.out.println("Hora invalida");
    }
    public int getMinuto(){
        return this.minuto;
    }
    public void setMinuto(int minuto){
        if (minuto >= 0 && minuto <= 59){
            this.minuto = minuto;
        }else System.out.println("Minutos invalidos");
    }
    public int getSegundo(){
        return this.segundo;
    }
    public void setSegundo(int segundo){
        if  (segundo >= 0 && segundo <= 59){
            this.segundo = segundo;
        }else System.out.println("Segundos invalidos");
    }
}
