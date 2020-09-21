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
public class TP01_Ex07 {
            public static void main(String[] args) {
        
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);

            double valor[] = new double[2];
            double soma=0;
            double mediag=0;

            for(int i =0; i<2;i++){
                System.out.println("Digite o valor a ser calculado: ");
                valor[i] = read.nextDouble();
            }


            mediag = Math.sqrt(valor[0]*valor[1]);

            System.out.println("Média geométrica: " + mediag);
        }
}
