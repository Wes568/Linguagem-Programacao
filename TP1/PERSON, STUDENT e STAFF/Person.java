//Wesley Oliveira CB300550X

import java.util.Scanner;

public class Person {
	Scanner scan = new Scanner(System.in);
	private String name, address;
	
	Person(String n, String add)
	{
		this.name =n;
		this.address = add;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String add)
	{
		address = add;
	}
	
	public String toString()
	{
		return "Pessoa[Nome = " + name + ", Endereco = " + address + "]";
	}
	
	public static void main(String[] args)
    {
    	

    }

}
