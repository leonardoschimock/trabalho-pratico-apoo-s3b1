/***************************
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
Descritivo: Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um
atributo matricula.

***************************/

// Classe Pessoa (classe pai)
class Pessoa {

    String nome;
    int idade;

    // Método para mostrar os dados da pessoa
    void mostrarPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

// Classe Aluno que herda de Pessoa
class Aluno extends Pessoa {

    String matricula;

    // Método para mostrar os dados do aluno
    void mostrarAluno() {
        mostrarPessoa(); // usa o método da classe Pessoa
        System.out.println("Matrícula: " + matricula);
    }
}

// Classe principal do programa
public class exercicio12 {

    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {

        // Criação de um objeto chamado aluno1 a partir da classe Aluno
        // Esse objeto poderá acessar os atributos nome, idade e matricula
        Aluno aluno1 = new Aluno();

        // Atribui o valor "Isadora" ao atributo nome do objeto aluno1
        aluno1.nome = "Isadora";

        // Atribui o valor 20 ao atributo idade do objeto aluno1
        aluno1.idade = 20;

        // Atribui o valor "2025001" ao atributo matricula do objeto aluno1
        aluno1.matricula = "2025001";

        // Chama o método mostrarAluno(), que exibirá os dados do aluno na tela
        aluno1.mostrarAluno();
    }

}

/**************************************************************
Este programa utiliza o conceito de herança da programação orientada
a objetos em Java. Foi criada uma classe chamada Pessoa contendo
os atributos nome e idade. Em seguida, foi criada a classe Aluno
que herda as características da classe Pessoa utilizando a palavra
"extends", adicionando também o atributo matrícula. No programa
principal é criado um objeto da classe Aluno, onde são atribuídos
valores aos atributos e as informações são exibidas na tela.
**************************************************************/
