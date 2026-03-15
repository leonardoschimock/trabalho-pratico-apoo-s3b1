public class exercicio11 {
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
Descritivo: Escreva um programa que defina uma classe Pessoa com atributos nome e idade, e métodos para exibir
esses atributos.

***************************/
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);
        Pessoa pessoa3 = new Pessoa("Pedro", 20);

        System.out.println("Pessoa 1: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        System.out.println("Pessoa 2: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
        System.out.println("Pessoa 3: " + pessoa3.getNome() + ", Idade: " + pessoa3.getIdade());
    }   
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
/* O programa define uma classe Pessoa com os atributos nome e idade, e métodos para acessar esses atributos. No método main, são criadas três instâncias da classe Pessoa e seus atributos são exibidos no console. */
