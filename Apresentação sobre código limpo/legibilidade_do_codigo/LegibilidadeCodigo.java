package legibilidade_do_codigo;


//código mais legível e reduzir sua complexidade

public class LegibilidadeCodigo {
    public static void executarPrograma(String[] args) {
        int primeiroNumero = 10;
        int segundoNumero = 20;
        int soma = primeiroNumero + segundoNumero;

        if (soma > 15 && soma < 30) {
            for (int i = 0; i < soma; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("A soma é maior que 30 ou menor que 15.");
        }
    }
} 