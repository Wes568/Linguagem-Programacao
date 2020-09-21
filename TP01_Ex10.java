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
public class TP01_Ex10 {
        public static void main(String[] args) {
        
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);

            double cel;
            double far;

            System.out.println("Digite o valor da temperatura em Celcius: ");
            cel = read.nextDouble();

            far = (cel*9/5) + 32;

            System.out.println("Valor convertido para Fahrenheit: " + far);
    }
}
