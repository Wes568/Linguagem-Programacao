
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
public class TP2_01 {
    public static void main(String[] args) {
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);

            double val[] = new double[2];

            System.out.println("Digite o primeiro valor: ");
            val[0] = read.nextDouble();

            do
            {
                System.out.println("Digite o segundo valor: ");
                val[1] = read.nextDouble();
                
                if(val[0]>val[1])
                {
                    System.out.println("O segundo valor deve ser maior que o primeiro, digite novamente.");   
                }
            }
            while(val[0]>val[1]);
    }
}
