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
public class TP01_Ex16 {
        public static void main(String[] args) {
            
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);

            double angulo;

            System.out.println("Digite o ângulo (30º, 45º ou 60º): ");
            angulo = read.nextDouble();
            
            if(angulo==30){
                System.out.println("Angulo escolhido = 30º");
                System.out.println("Seno:1/2");
                System.out.println("Cosseno:√3/2");
                System.out.println("Tangente:√3/3");
                System.out.println("Secante:2√3/3");
            }
            else{
                if(angulo==45){
                    System.out.println("Angulo escolhido = 45º");
                    System.out.println("Seno:√2/2");
                    System.out.println("Cosseno:√2/2");
                    System.out.println("Tangente:1");
                    System.out.println("Secante:√2");
                }
                else{
                    if(angulo==60){
                        System.out.println("Angulo escolhido = 60º");
                        System.out.println("Seno:√3/2");
                        System.out.println("Cosseno:1/2");
                        System.out.println("Tangente:√3");
                        System.out.println("Secante:2");
                    }
                }
            }
    }
    
    
}
