package Tema3.Strings;

public class MyString {
    public static String invUpper(String text){
        String upperText = text.toUpperCase();
        String outcome = "";
        for(int i = upperText.length() - 1; i >= 0; i--){
            char letter = upperText.charAt(i);
            outcome = outcome + letter;
        }
        return outcome;
    }
    public static int numVocal(String text){
        text = text.toLowerCase();
        int counter = 0;
        for (int i = 0; i < text.length();i++){
            char letter = text.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                counter ++;
        }
        return counter;
    }
    public static String biggestWord(String text){
        String[] palabras = text.split(" ");
        String aux = " ";
        for (int i = 0; i < palabras.length; i++) {
        if (palabras[i].length() > aux.length()){
            aux = palabras[i];
            }
        }
        return aux;
    }
    public static int timesInside(String text, String search){
        int counter = 0;
        int index = text.indexOf(search);
        while (index != -1){
            counter++;
            index = text.indexOf(search, index + 1);
        } return counter;
    }
    public static int wordCount(String text){
        return text.split(" ").length;
    }
    public static String telFormating(String tel){
        String prefix = tel.substring(0,2);
        String suffix1 = tel.substring(2,5);
        String suffix2 = tel.substring(5);
        return "(+" + prefix + ")-" + suffix1 + "-" + suffix2;
    }
    public static void histogram(String text){
        text = text.toLowerCase();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < text.length(); j++) {
            char letter = text.charAt(j);
            if (letter == 'a') a++;
            else if (letter == 'e') e++;
            else if (letter == 'i') i++;
            else if (letter == 'o') o++;
            else if (letter == 'u') u++;
        }
        dibujarBarra('a', a);
        dibujarBarra('e', e);
        dibujarBarra('i', i);
        dibujarBarra('o', o);
        dibujarBarra('u', u);
    }
    public static void dibujarBarra(char vocal, int cantidad) {
        System.out.print(vocal + " " + cantidad + " ");
        for (int j = 0; j < cantidad; j++) {
            System.out.print("*");
        }
        System.out.println(); // Salto de línea al terminar la barra
    }
}
