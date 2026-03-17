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
 Descritivo: programa solicita um número inteiro e exiba sua tabuada do 1 ao 10.
 ***************************/
public class exercicio14 {
    static void main(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

/***************************************************************** 
 O programa solicita que o usuário digite um número inteiro, 
 em seguida, utiliza um laço de repetição (for) para calcular a tabuada desse número de 1 até 10.
 A cada repetição, o programa multiplica o número digitado pelo valor atual do contador (i) e mostra o resultado na tela.
 Dessa forma, ao final do laço, toda a tabuada do número é exibida.
 ********************************************************************/
