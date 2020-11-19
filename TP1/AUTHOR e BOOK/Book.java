//Wesley Oliveira CB300550X

import java.util.Scanner;

public class Book {

	Scanner scan = new Scanner(System.in);
   	private Author[] authors;
	private String name;
	private double price;
	private int qty = 0;

	
	public Book(String n, Author[] au, double pr) 
	{
	    this.name = n;
	    this.authors = au;
	    this.price = pr;
	}

	public Book(String n, Author[] au, double pr, int q) 
	{
	    this.name = n;
	    this.authors = au;
	    this.price = pr;
	    this.qty = q;
	}
	
	public String getName() 
	{
	    return name;
	}
	
	public Author[] getAuthors(Author[] authors)
	{

	    return authors;
	}
	
	public double getPrice(double pr)
	{
	    return pr;
	}
	
	public void setPrice(double pr)
	{
	    price = pr;
	}
	
	public int getQty() 
	{
	    return qty;
	}
	
	public void setQty(int q)
	{
		qty = q;
	}
	
	public String toString()
	{
		String autores = "{";
        for(int i = 0; i < authors.length; i++){
            autores = autores + authors[i].toString();
        }
        autores = autores + "}";

		return "Livro[Nome = " + name + ", Autores = " + autores + ", Preco = " + price + ", Quantidade = " + qty +"]";
	}
	
	public void getAuthorNames()
	{

	}
	
	public static void main(String[] args)
	{
		
	}
}

