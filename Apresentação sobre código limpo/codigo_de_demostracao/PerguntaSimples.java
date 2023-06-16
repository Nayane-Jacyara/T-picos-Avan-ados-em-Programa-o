package codigo_de_demostracao;

public class PerguntaSimples implements Pergunta {
    private String pergunta;
    private String respostaCorreta;

    public PerguntaSimples(String pergunta, String respostaCorreta) {
        this.pergunta = pergunta;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public boolean verificarRespostaCorreta(String resposta) {
        return resposta.equalsIgnoreCase(respostaCorreta);
    }
}
