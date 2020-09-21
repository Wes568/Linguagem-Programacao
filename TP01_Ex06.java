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
public class TP01_Ex06 {
        public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double valor[] = new double[4];
        double soma=0;
        double media=0;
        
        for(int i =0; i<4;i++){
            System.out.println("Digite o valor a ser calculado: ");
            valor[i] = read.nextDouble();
        }

        for(int i =0; i<4;i++){
            soma = soma + valor[i];
        }
        
        media = soma/4;
        
        System.out.println("Média aritmética: " + media);
    }
    
}
