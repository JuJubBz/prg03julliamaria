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
public class PagamentoDinheiro implements Pagamento {
    
    // 2"gaveta" (atributo) para guardar o valor original da compra.
    // O 'final' serve para garantir que esse valor não mude depois de definido.
    private final double valor;
    
    // 3. Este é o Construtor. Ele serve para pegar o valor que você digitou
    // lá na tela (JFrame) e trazer para dentro desta classe.
    public PagamentoDinheiro(double valor){
        this.valor = valor;
    }
    
    // 4. Aqui é onde a conta acontece. Como é dinheiro, 10% de desconto.
    // Multiplicar por 0.90 é o jeito mais rápido de tirar 10% do total.
    @Override
    public double calcularTotal() {
        return this.valor * 0.90; 
    }

    // 5. Este método mostra uma mensagem lá no console
    // confirmando que o pagamento foi em dinheiro e mostrando o valor final.
    @Override
    public void imprimirRecibo() {
        System.out.println("Pagamento em dinheiro. Total: " + calcularTotal());
    }
}
