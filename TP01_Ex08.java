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
public class TP01_Ex08 {
    
        public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner read = new Scanner(System.in);
        
        double milha1;
        double km;
        double milha2=1852;
        
        System.out.println("Digite a quantidade de milhas marítimas a serem convertidas: ");
        milha1 = read.nextDouble();
        
        km = milha1*milha2;
        
        System.out.println("Em quilômetros, " + milha1 + "milhas marítimas equivalem à " + km + " Km");
    }
}
