package org.example;
import java.util.Scanner;

public class exercicio08 {

    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase ou palavra: ");
        String texto = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("Número de vogais: " + contador);
        scanner.close();
    }
}
