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
// Descritivo: Escreva um programa que defina uma interface Veiculo com métodos
// acelerar() e frear(), e implemente essa interface em uma classe Carro.
// ******************************************************************************************************************

public class exercicio13 {

    // Método principal do programa
    public static void main(String[] args) {

        // Cria um objeto da classe Carro
        Carro c = new Carro();

        //Chama os Métodos acelerar e frear
        c.acelerar();
        c.frear();
    }
}

// Interface Veiculo
interface Veiculo {
    void acelerar();
    void frear();
}

// Classe Carro que implementa a interface
class Carro implements Veiculo {

    // Implementação do método acelerar
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    // Implementação do método frear
    public void frear() {
        System.out.println("Carro freando");
    }
}

/***************************************************************
Explicação:
O programa cria uma interface chamada Veiculo com os métodos acelerar e frear.
A classe Carro implementa essa interface e define o comportamento desses métodos.
Na classe principal Main, um objeto Carro é criado e os métodos são chamados,
mostrando as ações no console.
 ***************************************************************/