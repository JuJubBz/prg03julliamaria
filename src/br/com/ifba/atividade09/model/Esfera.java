/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;

//Classe que representa uma esfera, herda de FormaTridimensional
public class Esfera extends FormaTridimensional {
    
    // Atributo que armazena o raio da esfera
    private double raio;

    // Construtor que inicializa o raio
    public Esfera(double raio) {
        this.raio = raio;
    }
    
    // Calcula e retorna a área da superfície da esfera (4 * π * r²)
    @Override
    public double obterArea() {
        return 4.0 * Math.PI * (raio * raio);
    }

    // Calcula e retorna o volume da esfera ((4/3) * π * r³)
    @Override
    public double obterVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    }

    // Retorna uma representação em texto da esfera
    @Override
    public String toString() {
        return "Esfera [Raio: " + this.raio + "]";
    }
    
}
