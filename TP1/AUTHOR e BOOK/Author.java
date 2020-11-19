
import java.util.Scanner;

public class Author {

	Scanner scan = new Scanner(System.in);	
	private String name, email;
	private char gender;


	public Author(String n, String e, char g)
	{
	    this.name = n;
	    this.email = e;
	    this.gender = g;
	}

	public String getName()
	{
	    return name;
	}

	public String getEmail()
	{
	    return email;
	}

	public void setEmail()
	{
		System.out.println("Digite o email: ");
		email = scan.next();
	}

	public char getGender()
	{
	    return gender;
	}

	public String toString()
	{
		 return "Autor[Nome = " + name + ", Email = " + email + ", Genero = " + gender + "]";	   
	}

    public static void main(String[] args)
    {

    }
}
