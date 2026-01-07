package Tema3.Strings;
import java.util.Scanner;
public class CaesarCipher {

    public static String encrypt(String mensaje) {
        String resultado = "";
        mensaje = mensaje.toUpperCase();

        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);

            if (letra == 'Z') {
                resultado += 'A';
            } else if (letra == '9') {
                resultado += '0';
            } else if (letra >= 'A' && letra < 'Z') {
                char siguiente = (char)(letra + 1);
                resultado += siguiente;
            } else if (letra >= '0' && letra < '9') {
                char siguiente = (char)(letra + 1);
                resultado += siguiente;
            } else {
                resultado += letra;
            }
        }
        return resultado;
    }

    public static String decrypt(String mensaje) {
        String resultado = "";
        mensaje = mensaje.toUpperCase();

        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);

            if (letra == 'A') {
                resultado += 'Z';
            } else if (letra == '0') {
                resultado += '9';
            } else if (letra > 'A' && letra <= 'Z') {
                char anterior = (char)(letra - 1);
                resultado += anterior;
            } else if (letra > '0' && letra <= '9') {
                char anterior = (char)(letra - 1);
                resultado += anterior;
            } else {
                resultado += letra;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CIFRADO CÉSAR ---");
        System.out.println("Escribe un mensaje:");
        String texto = sc.nextLine();

        String cifrado = encrypt(texto);
        System.out.println("Cifrado: " + cifrado);

        String descifrado = decrypt(cifrado);
        System.out.println("Descifrado: " + descifrado);
    }
}