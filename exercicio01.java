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
Descritivo: Escreva um programa que receba dois números inteiros e exiba a soma deles.
***************************/

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner dadosInf = new Scanner(System.in);

        int n1;
        int n2;
        int soma;

        System.out.print("Digite o primeiro número para ser somado: ");
        n1 = dadosInf.nextInt();

        System.out.print("Digite o segundo número para ser somado: ");
        n2 = dadosInf.nextInt();

        soma = n1 + n2;

        System.out.println("A soma dos dois números é: " + soma);

        dadosInf.close();
    }
}

/************************************************ COMENTÁRIO *****************************************************
O programa começa importando a classe Scanner, utilizada para ler dados digitados pelo usuário.
Em seguida é criada a classe exercicio01 e o método main, que é o ponto inicial de execução do programa.
Depois é criado um objeto Scanner chamado dadosInf para receber dados informados do teclado.
São declaradas três variáveis inteiras: n1 e n2, que armazenam os números digitados pelo usuário, e soma, que guardará o resultado da soma.
System.out.print significa que o programa pede ao usuário que digite dois números. 
Esses valores são lidos usando o método nextInt() e armazenados nas variáveis correspondentes.
Então, o programa realiza a soma dos dois números e exibe o resultado na tela. 
Por fim, o Scanner é fechado para liberar os recursos do sistema.
*****************************************************************************************************************/