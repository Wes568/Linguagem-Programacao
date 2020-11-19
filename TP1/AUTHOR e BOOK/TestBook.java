import java.util.Scanner;

public class TestBook {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String name, email;
		char gender;
		Author[] autores = new Author[2];
			    
		 	
			for(int i=0; i<2;i++)
			{
				System.out.println("Digite o nome: ");
				name = scan.next();
				System.out.println("Digite o email: ");
				email = scan.next();
				System.out.println("Digite o genero, F para feminino e M para masculino: ");
				gender = scan.next().charAt(0);
						
				autores[i] = new Author(name, email, gender);
			}
				    
			Book book = new Book("Java for Dummy",autores, 19.99, 99);
			System.out.println(book.toString());
		
		}
}
