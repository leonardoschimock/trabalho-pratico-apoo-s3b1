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
Descritivo: Desenvolva um programa que conte quantas palavras existem em uma string fornecida pelo usuário.
***************************/

import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {

        Scanner dadosInf = new Scanner(System.in);

        System.out.print("Digite sua frase para contar as palavras: ");

        String texto = dadosInf.nextLine();

        int numPalavras = 0;
        boolean temEspaço = false;

        for (int i = 0; i < texto.length(); i++) {

            char caracter = texto.charAt(i);

            if (caracter != ' ') {

                if (!temEspaço) {
                    numPalavras++;
                    temEspaço = true;
                }

            } else {
                temEspaço = false;
            }
        }

        System.out.println("Sua frase tem: " + numPalavras + " palavras");

        dadosInf.close();
    }
}

/************************************************ COMENTÁRIO *****************************************************
O programa começa importando a classe Scanner, que permite ler dados digitados pelo usuário.
Em seguida é criada a classe exercicio18 e o método main, que é onde o programa começa a executar.
Depois disso é criado o Scanner dadosInf, que lê a entrada do teclado.
O programa mostra uma mensagem pedindo para o usuário digitar uma frase e guarda essa frase na variável texto usando nextLine().
Em seguida são criadas duas variáveis:
numPalavras, que serve para contar quantas palavras existem na frase
temEspaço, que controla se o programa está dentro de uma palavra ou não.
O for percorre toda a frase caractere por caractere usando texto.length().
A cada repetição o programa pega um caractere da frase com charAt(i) e guarda na variável caracter.
Se o caractere não for um espaço, o programa verifica se ainda não estava dentro de uma palavra (!temEspaço).
Se ele for o início de uma palavra, ele aumenta o contador numPalavras++ e marca que agora está dentro de uma palavra colocando temEspaço = true.
Se o caractere for um espaço, significa que a palavra terminou, então temEspaço volta para false, permitindo que a próxima palavra seja contada.
Depois que todo o texto é percorrido, o programa mostra na tela quantas palavras existem na frase usando System.out.println.
Por fim, o Scanner é fechado com dadosInf.close().
*****************************************************************************************************************/