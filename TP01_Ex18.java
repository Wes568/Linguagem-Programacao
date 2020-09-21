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
public class TP01_Ex18 {
            public static void main(String[] args) {
            
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);
            
            double soma[] = new double[5];
            double soma2 =0;
            double pago, troco;
            
            for(int i=0;i<5;i++){
                System.out.println("Digite o valor do produto: ");
                soma[i] = read.nextDouble();
                soma2 = soma2+soma[i];
            }
            
            System.out.println("Digite o valor pago: ");
            pago = read.nextDouble();
            
            troco = pago - soma2; 
            
            System.out.println("Troco a ser entregue: " + troco);
           
    } 
}
