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
// Descritivo:  Implemente uma calculadora de Índice de Massa Corporal (IMC) que receba peso (kg) e altura (m) e
//exiba o resultado com a classificação correspondente (ex: abaixo do peso, normal, etc.).
// ******************************************************************************************************************

// Importa Scanner para ler dados
import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        // Cria leitor de dados
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso (kg): "); // Solicita o peso
        double peso = sc.nextDouble(); // Lê o peso

        System.out.print("Altura (m): "); // Solicita a altura
        double altura = sc.nextDouble(); // Lê a altura

        double imc = peso / (altura * altura); // Calcula o IMC

        System.out.printf("IMC: %.2f\n", imc); // Mostra o IMC

        // Verifica classificação
        if (imc < 18.5)
            System.out.println("Abaixo do peso");
        else if (imc < 25)
            System.out.println("Normal");
        else if (imc < 30)
            System.out.println("Sobrepeso");
        else
            System.out.println("Obesidade");

        // Fecha leitura
        sc.close();
    }
}

/***************************************************************
 O programa lê peso e altura usando Scanner, calcula o IMC com a fórmula
peso/(altura²) e utiliza if/else para verificar em qual faixa o resultado
se encontra, exibindo a classificação correspondente no console.
***************************************************************/