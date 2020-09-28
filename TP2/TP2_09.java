
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
public class TP2_09 {
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);

            double val[][] = new double[3][4];
            double val2[][] = new double[4][3];
            double num1;
            double num2;
            double constante;
            double whi=0;
            
            do
            {
            do
            {
                System.out.println("Digite o numero de linhas: ");
                num1 = read.nextDouble();

                if(num1>10){
                    System.out.println("Valor invalido, digite um numero menor ou igual a 10.");
                    whi=10;
                }
            }
            while(whi==10);
            
            whi=0;
            
            do
            {
                System.out.println("Digite o numero de colunas: ");
                num2 = read.nextDouble();
                
                if(num1>10){
                    System.out.println("Valor invalido, digite um numero menor ou igual a 10.");
                    whi=10;
                }
            }
            while(whi==10);
            
            whi=0;
            
            if(num1 != num2)
            {
                System.out.println("O número de linhas deve ser igual ao de colunas.");
                whi=10;
            }
            
            }while(whi==10);
          
            for(int i=0;i<num1;i++)
            {
                for(int z=0;z<num2;z++)
                {
                    System.out.println("Digite o valor para ser armazenado: ");
                    val[i][z] = read.nextDouble();
                }
            }
            
            System.out.println("Matriz normal: ");
            
            for(int i=0;i<num1;i++)
            {
                for(int z=0;z<num2;z++)
                {
                    System.out.printf(val[i][z] + " | ");
                }
                System.out.println();
            }
            
            System.out.println("Matriz transposta: ");

            for(int i=0;i<num2;i++)
            {
                for(int z=0;z<num1;z++)
                {
                    System.out.printf(val[z][i] + " | ");
                }
                System.out.println();
            }
    }         
}
