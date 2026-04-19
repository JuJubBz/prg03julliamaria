package br.com.ifba.atividade08.model;

import java.util.List;

/**
 * @author Julia Freitas
 */
public class PerfilUsuario {
    
    // ATRIBUTOS: Identificação e lista de acessos do perfil
    private long id;
    private String descricao;
    private List<String> permissoes;

    // CONSTRUTOR VAZIO: Cria o objeto sem dados iniciais
    public PerfilUsuario() {
    }

    // CONSTRUTOR COMPLETO: Inicializa o perfil com ID, nome e lista de permissões
    public PerfilUsuario(long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    // GETTERS E SETTERS: Métodos de acesso para os atributos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
    
    // TOSTRING: Exibe a descrição do perfil e a lista de permissões formatada
    @Override
    public String toString() {
        return "Perfil: " + descricao + " | Permissões: " + permissoes;
    }
    
}