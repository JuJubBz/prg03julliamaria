/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import br.com.ifba.atividade09.model.*;

// Classe principal responsável por executar o programa
public class Main {
    public static void main(String[] args) {

        // Array de formas (polimorfismo)
        Forma[] formas = new Forma[6];

        // Instanciação das formas
        formas[0] = new Circulo(3.0);
        formas[1] = new Quadrado(5.0);
        formas[2] = new Triangulo(4.0, 6.0);
        formas[3] = new Esfera(2.0);
        formas[4] = new Cubo(3.0);
        formas[5] = new Piramide(4.0, 5.0);

        // Percorre todas as formas
        for (Forma f : formas) {

            // Exibe descrição da forma
            System.out.println(f.toString());

            // Verifica se é bidimensional
            if (f instanceof FormaBidimensional) {
                FormaBidimensional f2d = (FormaBidimensional) f;
                System.out.println("Área: " + f2d.obterArea());
            } 
            // Verifica se é tridimensional
            else if (f instanceof FormaTridimensional) {
                FormaTridimensional f3d = (FormaTridimensional) f;
                System.out.println("Área: " + f3d.obterArea());
                System.out.println("Volume: " + f3d.obterVolume());
            }

            // Separador visual
            System.out.println("------------------------------------");
        }
    }
}
