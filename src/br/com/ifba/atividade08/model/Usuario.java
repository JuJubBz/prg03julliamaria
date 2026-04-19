package br.com.ifba.atividade08.model;

import java.time.LocalDateTime;

/**
 * @author Julia Freitas
 */
public class Usuario {
    
    // ATRIBUTOS: Armazenam os dados do usuário
    private long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senhas;
    private boolean ativo;
    private LocalDateTime ultimoLogin;
    
    // CONSTRUTOR VAZIO: Permite instanciar o objeto sem dados iniciais
    public Usuario() {
    }

    // CONSTRUTOR COMPLETO: Inicializa o objeto com todos os dados principais
    public Usuario(long id, PerfilUsuario perfil, String nomeUsuario, String email, String Senha, boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senhas = Senha;
        this.ativo = ativo;
    }

    // GETTERS E SETTERS: Permitem ler e modificar os atributos privados
    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhas() {
        return senhas;
    }

    public void setSenhas(String senhas) {
        this.senhas = senhas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    // TOSTRING: Formata os dados do objeto para exibição em texto
    @Override
    public String toString() {
        return "ID: " + id + " | Login: " + nomeUsuario + " | Email: " + email + " | [" + perfil + "]";
    }   
    
    // MÉTODO LOGAR: Valida a senha e registra a data/hora do acesso
    public void logar(String senhaInformada) {
        if (this.senhas.equals(senhaInformada)) {
            this.ultimoLogin = java.time.LocalDateTime.now(); // Salva o momento exato
            this.ativo = true;
            System.out.println("Login realizado com sucesso para: " + this.nomeUsuario);
        } else {
            System.out.println("Erro: Senha incorreta para o usuário " + this.nomeUsuario);
        }
    }
    
    // MÉTODO CRIAR SESSÃO: Fabrica um objeto Sessão vinculado a este usuário
    public Sessao criarSessao() {
        Sessao novaSessao = new Sessao();
        novaSessao.setUsuario(this); // Vincula este usuário à sessão
        
        // Gera um token baseado no tempo atual em milissegundos
        String tokenGerado = "TOKEN-" + System.currentTimeMillis();
        novaSessao.setToken(tokenGerado);
        
        System.out.println("Sessão criada com sucesso para o usuário: " + this.nomeUsuario);
        return novaSessao;
    }
}