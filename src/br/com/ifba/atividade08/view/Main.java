/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view; // Ou o pacote que você preferir

import br.com.ifba.atividade08.model.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        
        // 1. Criar uma lista de permissões e o Perfil
        List<String> permissoesAdmin = new ArrayList<>();
        permissoesAdmin.add("CADASTRAR_PRODUTO");
        permissoesAdmin.add("DELETAR_USUARIO");
        
        PerfilUsuario perfilAdm = new PerfilUsuario(1L, "Administrador", permissoesAdmin);
        
        // 2. Criar o Usuário e associá-lo ao Perfil (Relacionamento!)
        Usuario user = new Usuario();
        user.setId(100L);
        user.setNomeUsuario("Jullia Maria");
        user.setEmail("juliana12@ifba.edu.br");
        user.setSenhas("LeroLero");
        user.setAtivo(true);
        user.setPerfil(perfilAdm); // Aqui acontece a mágica da associação
        
        // 3. Criar uma Sessão para esse usuário
        Sessao sessao = new Sessao();
        sessao.setId(1L);
        sessao.setUsuario(user);
        sessao.setToken("TK12062006");
        
        // 4. Criar um Log de Auditoria para testar
        LogAuditoria log = new LogAuditoria();
        log.setId(500L);
        log.setUsuario(user);
        log.setAcao("Tentativa de Login");
        log.setDataHora(LocalDateTime.now());
        log.setIp("11111");
        
        // 5. Imprimir tudo usando o toString() que eu criei
        System.out.println("TESTE DE RELACIONAMENTOS");
        System.out.println(user);   // Vai mostrar o usuário e o perfil dentro dele
        System.out.println(sessao); // Vai mostrar a sessão e o dono dela
        System.out.println(log);    // Vai mostrar o histórico com a data/hora atual
    }
}
