package legibilidade_do_codigo;


//exemplo de código que pode ser torna mais legível
public class LegibilidadeDoCodigo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;

        if (c > 15 && c < 30) {
            for (int i = 0; i < c; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("C é maior que 30 ou menor que 15.");
        }
    }
}

