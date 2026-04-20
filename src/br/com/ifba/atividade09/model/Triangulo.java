/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;


// Classe que representa um triângulo, herda de FormaBidimensional
public class Triangulo extends FormaBidimensional {

    // Atributos que armazenam a base e a altura do triângulo
    private double altura;
    private double base;

    // Construtor que inicializa a base e a altura
    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    // Calcula e retorna a área do triângulo (base * altura / 2)
    @Override
    public double obterArea() {
        return (base * altura) / 2.0;
    }

    // Retorna uma representação em texto do triângulo
    @Override
    public String toString() {
       return "Triângulo [Base: " + this.base + " | Altura: " + this.altura + "]";
    }
    
}
