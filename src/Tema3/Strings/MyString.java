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
        for (int i = 0; i < text.length() ; i++) {

        }
    }
}
