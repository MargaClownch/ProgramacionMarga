import java.util.Scanner;
public class MargaEJ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hora;
        int minuto;
        int segundo;
        int pais;
        int salida;
        int diaSemana;
        String igualadorSemana = "Lunes";

        do {
            System.out.println("Introduce 1 para España y 2 para Japón: ");
            pais = sc.nextInt();
            System.out.println("Introduce el día de la semana 1-7");
            diaSemana = sc.nextInt();
            System.out.println("Introduce las horas 0-24");
            hora = sc.nextInt();
            System.out.println("Introduce los minutos 0-59");
            minuto = sc.nextInt();
            System.out.println("Introduce los segundos 0-59");
            segundo = sc.nextInt();
            System.out.println("Presione 1 para continuar o 9 para salir del programa!");
            salida = sc.nextInt();

            if (hora < 0 || hora > 24) {
                System.out.println("Hora incorrecta" );
            } else if (minuto < 0 || minuto > 59) {
                System.out.println("Minuto incorrecto");
            } else if (segundo < 0 || segundo > 59) {
                System.out.println("Segundo incorrecto");
            } else if (pais != 1 && pais != 2) {
                System.out.println("País incorrecto");
            } else if (diaSemana < 1 || diaSemana > 7) {
                System.out.println("Día de la semana incorrecto");
            }

            if (pais == 1){
                    hora = hora + 8;
                    if(hora >= 24){
                        hora = hora - 24;
                        diaSemana++;
                    }
                    if (hora <= 0){
                        hora = hora + 24;
                        diaSemana--;
                    }
                    if (diaSemana > 7 ){
                        diaSemana = 1;
                    }
                    if (diaSemana < 1){
                        diaSemana = 7;
                    }
                if (diaSemana == 1){
                    igualadorSemana = "Lunes";
                } else if (diaSemana == 2) {
                    igualadorSemana = "Martes";
                } else if (diaSemana == 3) {
                    igualadorSemana = "Miercoles";
                } else if (diaSemana == 4) {
                    igualadorSemana = "Jueves";
                } else if (diaSemana == 5) {
                    igualadorSemana = "Viernes";
                } else if (diaSemana == 6) {
                    igualadorSemana = "Sábado";
                } else if (diaSemana == 7) {
                    igualadorSemana = "Domingo";
                }
                    System.out.println("Has introducido España!!");
                    System.out.println("La hora en Japón es: " + hora + ":" + minuto + ":" + segundo + " Y el día de la semana es " + igualadorSemana );
                }else {
                    hora = hora - 8;
                    if(hora >= 24){
                        hora = hora - 24;
                        diaSemana++;
                    }
                if (hora <= 0){
                    hora = hora + 24;
                    diaSemana--;
                }
                if (diaSemana > 7){
                    diaSemana = 1;
                }
                if (diaSemana < 1){
                    diaSemana = 7;
                }
                if (diaSemana == 1){
                    igualadorSemana = "Lunes";
                } else if (diaSemana == 2) {
                    igualadorSemana = "Martes";
                } else if (diaSemana == 3) {
                    igualadorSemana = "Miercoles";
                } else if (diaSemana == 4) {
                    igualadorSemana = "Jueves";
                } else if (diaSemana == 5) {
                    igualadorSemana = "Viernes";
                } else if (diaSemana == 6) {
                    igualadorSemana = "Sábado";
                } else if (diaSemana == 7) {
                    igualadorSemana = "Domingo";
                }
                    System.out.println("Has introducido Japón!!");
                    System.out.println("La hora en España es: " + hora + ":" + minuto + ":" + segundo + " Y el día de la semana es " + igualadorSemana);
                }
        }
        while (salida != 9);
    }
}
