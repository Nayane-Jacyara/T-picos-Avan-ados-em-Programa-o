package codigo_sem_refratora;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        
        String[][] perguntasRespostas = {
            {"Qual é a capital do Brasil?", "Brasilia"},
            {"Qual é a capital de Pernambuco?", "Recife"},
            {"Qual é o maior estado do Brasil?", "Amazonas"}
        };
        
        int acertos = 0;
        int erros = 0;
        
        for (int i = 0; i < perguntasRespostas.length; i++) {
            
            System.out.print(perguntasRespostas[i][0] + " ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase(perguntasRespostas[i][1])) {
                System.out.println("Resposta correta!");
                acertos++;
            } else {
                System.out.println("Resposta incorreta! A resposta correta é: " + perguntasRespostas[i][1]);
                erros++;
            }
        }
        scanner.close();
        
        System.out.println("Fim do quiz!");
        System.out.println(nome + "\nacertos: " + acertos + "\nerros: " + erros);
        
    }
}
