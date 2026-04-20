/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;

// Classe abstrata para representar formas tridimensionais (3D)
public abstract class FormaTridimensional extends Forma {
    
    // Obriga as subclasses a implementarem o cálculo da área (superfície)
    public abstract double obterArea();
    
    // Obriga as subclasses a implementarem o cálculo do volume
    public abstract double obterVolume();
    
}
