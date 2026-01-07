package PracticaExamen;

public class practicas {
    public static boolean esCodigoValido(String codigo){
        if(codigo.length()==4 && codigo.charAt(0)=='A'){
            return true;
        }else return false;
    }
    public static double calcularMedia(int[] notas){
    int acumulador = 0;
    double media = 0;
    for (int i = 0; i < notas.length; i++) {
        media += notas[i];
        acumulador++;
    }
    return media/acumulador;
    }
    public static String limpiarVocales(String texto){
        String resultado = "";
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                resultado += letra;
            }
        }
        return resultado;
    }
}
