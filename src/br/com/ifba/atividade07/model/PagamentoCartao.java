/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.model;

import br.com.ifba.atividade07.interfaces.Pagamento;

/**
 *
 * @author Julia Freitas
 */
public class PagamentoCartao implements Pagamento {

    // Aqui a gente cria uma "gavetinha" para guardar o preço do produto.
    private double valor;
    
    // Esse é o construtor. Ele pega o valor que você digitou na tela 
    // e coloca dentro da "gavetinha" lá de cima.
    public PagamentoCartao(double valor){
        this.valor = valor;
    }
    
    // Aqui é onde a mágica do cálculo acontece!
    @Override
    public double calcularTotal() {
        // A conta é: pega o valor e soma com 5% dele mesmo.
        // É como se o banco cobrasse uma taxinha extra por usar o cartão.
        return this.valor * 1.05;
    }

    // Esse método serve para avisar no console do NetBeans o que aconteceu.
    @Override
    public void imprimirRecibo() {
        System.out.println("Pagamento pelo cartao. Total: " + calcularTotal());
    }
}
