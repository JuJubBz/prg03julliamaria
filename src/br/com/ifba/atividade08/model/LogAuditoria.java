package br.com.ifba.atividade08.model;

import java.time.LocalDateTime;

/**
 * @author Julia Freitas
 */
public class LogAuditoria {
    
    // ATRIBUTOS: Detalhes do registro de auditoria (quem, quando, onde e o quê)
    private long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;

    // CONSTRUTOR VAZIO: Permite criar o log sem dados iniciais
    public LogAuditoria() {
    }

    // CONSTRUTOR COMPLETO: Inicializa o log com todas as informações do evento
    public LogAuditoria(long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = dataHora;
        this.ip = ip;
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

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    // TOSTRING: Exibe o registro formatado com data, ação, nome do usuário e IP
    @Override
    public String toString() {
        return "[" + dataHora + "] Ação: " + acao + " | Usuário: " + usuario.getNomeUsuario() + " | IP: " + ip;
    }
    
}