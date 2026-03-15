public class exercicio17 {
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
Descritivo: Desenvolva um jogo onde o computador sorteie um número entre 1 e 100, e o usuário tente adivinhá-lo.
O programa deve dar dicas ("maior" ou "menor") até o acerto.
***************************/
    public static void main(String[] args) {
        int numeroSorteado = (int) (Math.random() * 100) + 1;
        int tentativa = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (tentativa != numeroSorteado) {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();

            if (tentativa < numeroSorteado) {
                System.out.println("O número é maior. Tente novamente.");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }
        }

        scanner.close();
    }
     /* O programa faz um jogo de adivinhação, onde o computador gera um número aleatório entre 1 e 100, e o usuário precisa tentar descobrir qual é esse número. O programa informa se o número digitado é maior ou menor que o número sorteado, até que o usuário acerte.*/
}
