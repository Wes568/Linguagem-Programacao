/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade;
//Wesley Oliveira CB300550X
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class TP01_Ex14 {
        public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double raio;
        double aresta;
        double volume;
        
        System.out.println("Digite o valor da aresta: ");
        aresta = read.nextDouble();
        
        System.out.println("Digite o valor do raio: ");
        raio = read.nextDouble();
       
       volume = ((4/3)*3.14)*Math.pow(raio, 3);
       
        System.out.printf("O volume livre da esfera inscrita no cubo: " + decimal.format(volume));
    }
    
}
