package codigo_de_demostracao;

public class PerguntaMultiplaEscolha implements Pergunta {
    private String pergunta;
    private String respostaCorreta;
    private String[] opcoes;

    public PerguntaMultiplaEscolha(String pergunta, String respostaCorreta, String[] opcoes) {
        this.pergunta = pergunta;
        this.respostaCorreta = respostaCorreta;
        this.opcoes = opcoes;
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

    public String[] getOpcoes() {
        return opcoes;
    }
}
