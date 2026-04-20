/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;

// Classe que representa um cubo, herda de FormaTridimensional
public class Cubo extends FormaTridimensional {

    // Atributo que armazena o valor do lado do cubo
    private double lado;

    // Construtor que inicializa o lado
    public Cubo(double lado) {
        this.lado = lado;
    }
    
    // Calcula e retorna a área da superfície do cubo (6 * lado²)
    @Override
    public double obterArea() {
       return 6 * (lado * lado); 
    }

    // Calcula e retorna o volume do cubo (lado³)
    @Override
    public double obterVolume() {
        return Math.pow(lado, 3);
    }

    // Retorna uma representação em texto do cubo
    @Override
    public String toString() {
        return "Cubo [Lado: " + this.lado + "]";
    }
    
}
