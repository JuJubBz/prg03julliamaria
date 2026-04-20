/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;


// Classe abstrata para representar formas bidimensionais (2D)
public abstract class FormaBidimensional extends Forma {
    
    // Obriga as subclasses a implementarem o cálculo da área
    public abstract double obterArea();
}
