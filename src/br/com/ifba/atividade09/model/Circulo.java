/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;


// Classe que representa um círculo, herda de FormaBidimensional
public class Circulo extends FormaBidimensional {
    
    // Atributo que armazena o raio do círculo
    private double raio;

    // Construtor que inicializa o raio
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    // Retorna uma representação em texto do círculo
    @Override
    public String toString() {
       return "Círculo [Raio: " + this.raio + "]";
    }

    // Calcula e retorna a área do círculo (π * r²)
    @Override
    public double obterArea() {
       return Math.PI * (raio * raio);  
    }
}
