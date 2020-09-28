
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
public class TP2_08 {
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);

            double val[][] = new double[3][4];
            double val2[][] = new double[3][4];
            double constante;
          
            for(int i=0;i<3;i++)
            {
                for(int z=0;z<4;z++)
                {
                    System.out.println("Digite o valor para ser armazenado: ");
                    val[i][z] = read.nextDouble();
                }
            }
            
            System.out.println("Digite a constante multiplicativa: ");
            constante = read.nextDouble();
            
            for(int i=0;i<3;i++)
            {
                for(int z=0;z<4;z++)
                {
                    val2[i][z] = (val[i][z]*constante);
                }
            }
            
            System.out.println("Valores normais: ");

            for(int i=0;i<3;i++)
            {
                for(int z=0;z<4;z++)
                {
                    System.out.printf(val[i][z] + " | ");
                }
                System.out.println();
            }
            
            System.out.println("Valores apos multiplicacao: ");

            for(int i=0;i<3;i++)
            {
                for(int z=0;z<4;z++)
                {
                    System.out.printf(val2[i][z] + " | ");
                }
                System.out.println();
            }
    }     
}
