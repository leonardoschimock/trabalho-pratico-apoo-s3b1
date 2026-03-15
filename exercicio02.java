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
Descritivo: Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar.

***************************/

import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class exercicio02 {

    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner

        System.out.print("Digite um número inteiro: "); // Pede um número ao usuário
        int numero = scanner.nextInt(); // Lê o número digitado

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é PAR"); // Executa se for par
        } else {
            System.out.println("O número é ÍMPAR"); // Executa se não for par
        }

        scanner.close(); // Fecha o Scanner
    }
}

/**************************************************************
Este programa lê um número inteiro informado pelo usuário e verifica
se ele é par ou ímpar. O número digitado é armazenado em uma variável
e, em seguida, é utilizada uma estrutura de decisão (if e else) para
realizar a verificação. O operador de resto da divisão (%) é usado
para dividir o número por 2. Se o resto da divisão for igual a zero,
o número é considerado par; caso contrário, é ímpar. Ao final, o
resultado é exibido na tela.
**************************************************************/