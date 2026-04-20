/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;

// Classe abstrata que serve como base para diferentes formas geométricas
public abstract class Forma {
    
    // Obriga as subclasses a implementarem uma representação em texto da forma
    @Override
    public abstract String toString();
}
