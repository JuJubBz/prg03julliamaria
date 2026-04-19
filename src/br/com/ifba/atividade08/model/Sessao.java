package br.com.ifba.atividade08.model;

/**
 * @author Julia Freitas
 */
public class Sessao {
    
    // ATRIBUTOS: Dados que identificam a sessão e o usuário conectado
    private long id;
    private Usuario usuario;
    private String token;

    // CONSTRUTOR VAZIO: Permite criar o objeto sem dados iniciais
    public Sessao() {
    }

    // CONSTRUTOR COMPLETO: Inicializa a sessão com ID, Usuário e Token
    public Sessao(long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    // GETTERS E SETTERS: Métodos de acesso para os atributos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    // TOSTRING: Exibe o nome do dono da sessão e o código do token
    @Override
    public String toString() {
        return "Sessão do Usuário: " + usuario.getNomeUsuario() + " | Token: " + token;
    }
    
}