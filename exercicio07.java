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
Descritivo: Escreva um programa que encontre o maior número em um array de inteiros.

***************************/
public class exercicio07 {

    // Método principal, onde a execução do programa começa

    public static void main(String[] args) {

        int[] numeros = {5, 10, 3, 8, 2}; // Array de inteiros
        int maior = numeros[0]; // Inicializa o maior com o primeiro elemento do array

        // Percorre o array para encontrar o maior número
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; // Atualiza o maior se encontrar um número maior
            }
        }

        System.out.println("O maior número é: " + maior); // Imprime o maior número encontrado
    }
    
}

/**************************************************************
Este programa cria um array contendo alguns números inteiros e
utiliza um laço de repetição (for) para percorrer todos os seus
elementos. Inicialmente, a variável "maior" recebe o primeiro valor
do array. Durante a repetição, cada número é comparado com a variável
"maior" e, caso seja encontrado um valor maior, essa variável é
atualizada. Ao final do processo, o programa imprime na tela o
maior número encontrado no array.
**************************************************************/
