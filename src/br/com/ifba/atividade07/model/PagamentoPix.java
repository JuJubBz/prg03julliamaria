/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.model;

import br.com.ifba.atividade07.interfaces.Pagamento;

public class PagamentoPix implements Pagamento {
    
    // 1. Nossa "gavetinha" para guardar o preço original
    private double valor;
    
    // 2. O construtor que recebe o valor lá 
    public PagamentoPix(double valor){
        this.valor = valor;
    }
    
    // 3. A regra do Pix: aqui calculamos o desconto de 2%
    @Override
    public double calcularTotal() {
       // Multiplicar por 0.98 é o mesmo que tirar 2% do total.
       // É o famoso "cashback" ou desconto por ser à vista!
       return this.valor * 0.98; 
    }

    // 4. O recibo que aparece na parte de baixo do NetBeans (o console)
    @Override
    public void imprimirRecibo() {
        System.out.println("Pagamento pelo Pix. Total: " + calcularTotal());
    }
}
