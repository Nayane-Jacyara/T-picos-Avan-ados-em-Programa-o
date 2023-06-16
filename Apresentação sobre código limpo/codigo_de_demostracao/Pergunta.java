package codigo_de_demostracao;

public interface Pergunta {
    String getPergunta();
    String getRespostaCorreta();
    boolean verificarRespostaCorreta(String resposta);
}
