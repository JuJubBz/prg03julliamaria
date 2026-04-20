/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;

// Classe que representa um quadrado, herda de FormaBidimensional
public class Quadrado extends FormaBidimensional {
    
    // Atributo que armazena o valor do lado do quadrado
    private double lado;

    // Construtor que inicializa o lado
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    // Calcula e retorna a área do quadrado (lado²)
    @Override
    public double obterArea() {
        return lado * lado;
    }

    // Retorna uma representação em texto do quadrado
    @Override
    public String toString() {
        return "Quadrado [Lado: " + this.lado + "]";
    }
    
}
