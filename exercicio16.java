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
Descritivo: Escreva um programa que valide uma senha de acordo com os seguintes critérios:
-Pelo menos 8 caracteres
-Pelo menos uma letra maiúscula
-Pelo menos uma letra minúscula
-Pelo menos um número
***************************/

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {

        Scanner dadosInf = new Scanner(System.in);
        String senha;

        while (true) { // repete até a senha ser válida

            System.out.print("Inf. sua senha: ");
            senha = dadosInf.nextLine();

            boolean Mai = false;
            boolean Min = false;
            boolean Num = false;

            if (senha.length() >= 8) {

                for (int i = 0; i < senha.length(); i++) {
                    char caracterSenha = senha.charAt(i);

                    if (Character.isUpperCase(caracterSenha)) {
                        Mai = true;
                    } else if (Character.isLowerCase(caracterSenha)) {
                        Min = true;
                    } else if (Character.isDigit(caracterSenha)) {
                        Num = true;
                    }
                }

                if (Mai && Min && Num) {
                    System.out.println("Sua senha esta validada!");
                    break; // sai do loop quando a senha estiver correta
                } else {
                    System.out.println("Senha não foi validada! Tente novamente.");
                }

            } else {
                System.out.println("Sua senha deve ter pelo menos 8 caracteres!");
            }
        }

        dadosInf.close();
    }
}

/************************************************ COMENTÁRIO *****************************************************
O programa valida uma senha digitada pelo usuário de acordo com os critérios definidos: 
possuir pelo menos 8 caracteres, conter ao menos uma letra maiúscula, uma letra minúscula e um número. 
Para ler a senha digitada é utilizada a classe Scanner.
O programa usa um laço while(true) para continuar solicitando a senha até que ela seja válida.
Após a entrada da senha, são criadas variáveis booleanas responsáveis por verificar a presença de letra maiúscula, minúscula e número.
Em seguida, o programa verifica se a senha possui no mínimo 8 caracteres. 
Caso atenda a esse requisito;
Um laço for percorre cada caractere da senha com o método charAt(),enquanto métodos da classe Character identificam se o caractere é maiúsculo, minúsculo ou numérico.
Após a verificação, se todos os critérios forem atendidos a senha é considerada válida e o programa é encerrado;
Caso contrário, é exibida uma mensagem informando que a senha não foi validada e o usuário deve tentar novamente.
*****************************************************************************************************************/