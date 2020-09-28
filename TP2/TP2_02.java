
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class TP2_02 {
    public static void main(String[] args) {
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);

            double soma = 0;
            double maior = 0;
            double media = 0;
            double val[] = new double[10];
            
            for(int i=0;i<=9;i++)
            {
                System.out.println("Digite o " + (i+1) + "º valor: ");
                val[i] = read.nextDouble();
                
                if(val[i]<0){
                    System.out.println("Valor invalido, deve ser positivo. Digite o " + (i+1) + "º valor: ");
                    val[i] = read.nextDouble();
                }
            }

            
            for(int i=0;i<=9;i++)
            {
                if(maior<val[i])
                {
                    maior = val[i];
                }
            }
            
            
            for(int i=0; i<=9;i++)
            {
                soma = soma + val[i];
            }
            
            media = soma/10;
           
            System.out.println("O maior valor: " + maior);
            System.out.println("A soma dos valores: " + soma);  
            System.out.println("Media aritmetica dos valores: " + media);  

    }    
}
