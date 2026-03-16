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
 Descritivo: uma calculadora simples de quatro operações (+ - * /)
 ***************************/
public class exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+ - * /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                break;

            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}