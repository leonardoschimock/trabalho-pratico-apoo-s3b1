// ******************************************************************************************************************
// Curso: Engenharia de Software
// Disciplina: Análise e Projeto Orientado a Objetos
// Professor: José Carlos Flores
// Turma: ESOFT3B
// Componentes:
// 25212854-2 - Arthur de Andrade Malvaso
// 25034198-2 - Carlos Eduardo dos Santos da Silva
// 25216341-2 - Isadora Tereza Taques Fernandes
// 25357718-2 - Jean Carlos Siqueira dos Santos
// 25363487-2 - Leonardo Schimock Silveira
// 25363611-2 - Thiago de Barros Inácio
// Data: 16 de Março de 2026
// Descritivo: Escreva um programa que exiba apenas os números pares de 1 a 20.
// ******************************************************************************************************************

public class exercicio05 {

    public static void main(String[] args) {
        // Método principal onde o programa começa a executar

        for (int i = 1; i <= 20; i++) {
            // Laço que percorre os números de 1 até 20

            if (i % 2 == 0) {
                // Verifica se o número é par (resto da divisão por 2 é igual a 0)

                System.out.println(i);
                // Exibe o número par no console

            }

        }

    }

}

/**************************************************************
Este programa percorre os números de 1 a 20 utilizando o for para verificar se o número é par usando o operador de módulo (%).
Quando o resto da divisão por 2 é igual a 0, o número é considerado par
e é exibido no console.
***************************************************************/