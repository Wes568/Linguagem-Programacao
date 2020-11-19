
public class TestAuthor {
    public static void main(String[] args)
    {
    	
        Author autor = new Author("Arnaldo","arnaldoliveira@hotmail.com",'M');
        System.out.println(autor.toString());
        autor.setEmail();
        System.out.println(autor.toString());

    }
}
