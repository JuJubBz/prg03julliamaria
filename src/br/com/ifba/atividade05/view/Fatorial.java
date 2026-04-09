/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05.view;

/**
 *
 * @author Julia Freitas
 */
public class Fatorial {

    // Variáveis para guardar o número, o resultado e a frase da conta
    private int num = 0;
    private long fat = 1;
    private String formula = "";

    // Esse método recebe o número e faz todo o cálculo
    public void setValor(int n) {
        
        num = n;
        long f = 1;
        String s = "";
        
        // Laço que começa no número escolhido e vai descendo até 1
        for (int i = n; i > 1; i--) {
            f *= i;           // Multiplica o valor atual pelo próximo
            s += i + " x ";   // Vai montando a frase: "5 x 4 x..."
        }
        
        s += "1 = "; // Fecha a frase 
        fat = f;     // Guarda o resultado final da multiplicação
        formula = s; // Guarda a frase completa
    }

    // Método que a tela usa para pegar o resultado (ex: 120)
    public long getFatorial() {
        return fat;
    }

    // Método que a tela usa para pegar a frase (ex: 5 x 4 x 3 x 2 x 1 =)
    public String getFormula() {
        return formula;
    }
}
