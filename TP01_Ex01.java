/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade;
//Wesley Oliveira CB300550X
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Wesley
 */
public class TP01_Ex01 {
    public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double base;
        double altura;
        double area;
        
        System.out.println("Digite o valor da base do retângulo: ");
        base = read.nextDouble();
        
        System.out.println("Digite o valor da altura do retângulo: ");
        altura = read.nextDouble();
        
        area = base*altura;
        
        System.out.printf("A área do retângulo é: " + area);
    }
}
