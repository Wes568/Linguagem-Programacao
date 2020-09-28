
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
public class TP2_06 {
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);

            String val[][] = new String[2][3];
          
            for(int i=0;i<2;i++)
            {
                for(int z=0;z<3;z++)
                {
                    System.out.println("Digite a palavra para ser armazenada: ");
                    val[i][z] = read.next();
                }
            }
            
            System.out.println("Palavras: ");

            for(int i=0;i<2;i++)
            {
                for(int z=0;z<3;z++)
                {
                    System.out.printf(val[i][z] + " | ");
                }
                System.out.println();
            }
    }    
}
