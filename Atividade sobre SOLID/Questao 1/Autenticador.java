public class Autenticador {
    private RepositorioUsuarios repositorioUsuarios;
    private HashProvider hashProvider;

    public Autenticador(RepositorioUsuarios repositorioUsuarios, HashProvider hashProvider) {
        this.repositorioUsuarios = repositorioUsuarios;
        this.hashProvider = hashProvider;
    }

    public boolean autenticarUsuario(String email, String senha) {
        Usuario usuario = repositorioUsuarios.getUsuarioPorEmail(email);
        return autenticarUsuario(usuario, senha);
    }

    private boolean autenticarUsuario(Usuario usuario, String senha) {
        if (usuario == null) {
            return false;
        }

        String senhaHasheada = hashProvider.getHash(senha);
        if (!usuario.getHashSenha().equals(senhaHasheada)) {
            return false;
        }

        usuario.setAutenticado(true);
        repositorioUsuarios.registraLogin(usuario);

        return true;
    }
}
