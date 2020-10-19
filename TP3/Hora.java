/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


/**
 *
 * @author Wesley
 */
public class Hora {
    
    Scanner scan = new Scanner(System.in);
    
    private int hora, min, seg;
    
    public Hora() 
    {
        setHor();
        setMin();
        setSeg();
    }
    
    public Hora(int h, int m, int s)
    {
        setHor(h);
        setMin(m);
        setSeg(s);
    }
    
    public void setHor(int h) 
    {
        hora = h;
    }
    
    public void setMin(int m) 
    {
        min = m;
    }
    
    public void setSeg(int s) 
    {
        seg = s;
    }
    
    public void setHor()
    { 
        do
        {
            System.out.println("Digite a hora: ");
            hora = scan.nextInt();
        }
        while(hora > 23 && hora < 0);
    }
    
    public void setMin()
    {
        do
        {
            System.out.println("Digite o minuto: ");
            min = scan.nextInt();
        }
        while(min > 59 && min < 0);   
    }
    
    public void setSeg()
    {
        do
        {
            System.out.println("Digite o segundo: ");
            seg = scan.nextInt();
        }
        while(seg > 59 && seg < 0);
    }
    
    public int getHor()
    {
        return hora;
    }
    
    public int getMin()
    {
        return min;
    }
    
    public int getSeg()
    {
        return seg;
    }
    
    public String getHora1() 
    {
        String string_hora = "";
        String string_minuto = "";
        String string_segundo = "";
        
        string_hora = String.format("%02d", hora);
        string_minuto = String.format("%02d", min);
        string_segundo = String.format("%02d", seg);
        
        return string_hora + ":" + string_minuto + ":" + string_segundo;
    }
    
    public String getHora2() 
    {
        String AMPM = "AM";
        String string_hora = "";
        String string_minuto = "";
        String string_segundo = "";
        
        if(hora > 12)
        {
            AMPM = "PM";
            hora = hora - 12;
        }
        
        string_hora = String.format("%02d", hora);
        string_minuto = String.format("%02d", min);
        string_segundo = String.format("%02d", seg);
        
        return string_hora + ":" + string_minuto + ":" + string_segundo + " " + AMPM;
    }
    
    public String getSegundos() 
    {
        return "Total de segundos: " + seg + (min * 60) + (hora * 3600);
    }
    
    public static void main(String[] args)
    {
        Hora hora = new Hora();

	System.out.println(hora.getHora1());
	System.out.println(hora.getHora2());
	System.out.println(hora.getSegundos());
    }
    
    
}
