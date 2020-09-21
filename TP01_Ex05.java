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
public class TP01_Ex05 {
    public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double diametro;
        double raio;
        double volume;
        
        System.out.println("Digite o valor do diâmetro da esfera: ");
        diametro = read.nextDouble();
        
        raio = diametro/2;
        volume = (4*3.14*Math.pow(raio,3))/3;
        
        System.out.printf("O volume da esfera é: " + decimal.format(volume));
    }
    
}
