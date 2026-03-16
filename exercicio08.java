package org.example;
import java.util.Scanner;
/**************************
 Curso: Engenharia de Software
 Disciplina: Análise e Projeto Orientado a Objetos
 Professor: José Carlos Flores
 Turma: ESOFT3B
 Componentes:
 25212854-2 - Arthur de Andrade Malvaso
 25034198-2 - Carlos Eduardo dos Santos da Silva
 25216341-2 - Isadora Tereza Taques Fernandes
 25357718-2 - Jean Carlos Siqueira dos Santos
 25363487-2 - Leonardo Schimock Silveira
 25363611-2 - Thiago de Barros Inácio
 Data: 16 de Março de 2026
 Descritivo: programa que conta o número de vogais em uma string fornecida pelo usuário.
 ***************************/
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
