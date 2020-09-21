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
public class TP01_Ex11 {
    public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double diametro;
        double raio;
        double area;
        
        System.out.println("Digite o valor do diâmetro da circulo: ");
        diametro = read.nextDouble();
        
        raio = diametro/2;
        area = 3.14*Math.pow(raio,2);
        
        System.out.printf("A area do circulo é: " + decimal.format(area) +"²");
    }
    
}
