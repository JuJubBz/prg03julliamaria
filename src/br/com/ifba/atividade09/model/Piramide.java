/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;

// Classe que representa uma pirâmide de base quadrada, herda de FormaTridimensional
public class Piramide extends FormaTridimensional {
    
    // Atributos que armazenam o lado da base e a altura da pirâmide
    private double ladoBase;
    private double altura;

    // Construtor que inicializa o lado da base e a altura
    public Piramide(double ladoBase, double altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    // Calcula e retorna a área total (base + faces laterais)
    @Override
    public double obterArea() {
        return Math.pow(ladoBase, 2) + 
               2 * ladoBase * Math.sqrt(Math.pow(ladoBase / 2, 2) + Math.pow(altura, 2));
    }

    // Calcula e retorna o volume ((1/3) * área da base * altura)
    @Override
    public double obterVolume() {
        return (1.0 / 3.0) * Math.pow(ladoBase, 2) * altura;
    }

    // Retorna uma representação em texto da pirâmide
    @Override
    public String toString() {
        return "Pirâmide [Lado Base: " + this.ladoBase + " | Altura: " + this.altura + "]";
    }
    
}
