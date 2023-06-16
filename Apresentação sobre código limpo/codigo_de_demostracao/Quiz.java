package codigo_de_demostracao;

import java.util.Scanner;

public class Quiz {
    private Pergunta[] perguntas;
    private Scanner scanner;

    public Quiz() {
        scanner = new Scanner(System.in);

        perguntas = new Pergunta[] {
            new PerguntaSimples("Qual é a capital do Brasil?", "Brasília"),
            new PerguntaMultiplaEscolha("Qual é a capital de Pernambuco?", "Recife", new String[] {"Recife", "São Paulo", "Rio de Janeiro"}),
            new PerguntaSimples("Qual é o maior estado do Brasil?", "Amazonas")
        };
    }

    public void iniciar() {
        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        int acertos = 0;
        int erros = 0;

        for (Pergunta pergunta : perguntas) {
            System.out.print(pergunta.getPergunta() + " ");

            if (pergunta instanceof PerguntaMultiplaEscolha) {
                PerguntaMultiplaEscolha perguntaMultipla = (PerguntaMultiplaEscolha) pergunta;
                exibirOpcoes(perguntaMultipla.getOpcoes());
            }

            String resposta = scanner.nextLine();

            if (pergunta.verificarRespostaCorreta(resposta)) {
                System.out.println("Resposta correta!");
                acertos++;
            } else {
                System.out.println("Resposta incorreta! A resposta correta é: " + pergunta.getRespostaCorreta());
                erros++;
            }
        }

        scanner.close();

        System.out.println("Fim do quiz!");
        System.out.println(nome + "\nacertos: " + acertos + "\nerros: " + erros);
    }

    private void exibirOpcoes(String[] opcoes) {
        System.out.println("Opções:");
        for (String opcao : opcoes) {
            System.out.println("- " + opcao);
        }
    }
}
