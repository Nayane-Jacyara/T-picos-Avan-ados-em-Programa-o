class ControleAcesso {
    private Identifica identifica;
    private Permissao permissao;

    public ControleAcesso(Identifica identifica, Permissao permissao) {
        this.identifica = identifica;
        this.permissao = permissao;
    }

    Usuario fazerLogin(Usuario usuario, String cargo) {
        if (identifica.isValid(usuario) && permissao.hasHole(usuario, cargo)) {
            return usuario;
        }
        throw new AcessoProibidoException("Acesso Negado");
    }
}


interface Identifica {
    boolean isValid(Usuario usuario);
}

class IdentificacaoService implements Identifica {
    public boolean isValid(Usuario usuario) {
        // autentica usuário no BD
    }
}

class IdentificacaoERPService implements Identifica {
    public boolean isValid(Usuario usuario) {
        // autentica usuário no ERP
    }
}

class IdentificacaoExternaService implements Identifica {
    public boolean isValid(Usuario usuario) {
        // autentica usuário no sistema externo
    }
}

interface Permissao {
    boolean hasHole(Usuario usuario, String cargo);
}

class PermissaoService implements Permissao {
    public boolean hasHole(Usuario usuario, String cargo) {
        // verifica permissões no serviço
    }
}

class PermissaoToken implements Permissao {
    public boolean hasHole(Usuario usuario, String cargo) {
        // comportamento diferente para a permissão do token
    }
}