//Wesley Oliveira CB300550X

public class Student extends Person {


	private String program;
	private int year;
	private double fee;
	
	Student(String n, String add, String pr, int y, double f) 
	{
		super(n, add);
		this.program = pr;
		this.year = y;
		this.fee = f;
	}

	public String getProgram() 
	{
		return program;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public double getFee() 
	{
		return fee;
	}
	
	public void setProgram(String pr)
	{
		program = pr;
	}

	public void setYear(int y)
	{
		year = y;
	}
	
	public void setFee(double f)
	{
		fee = f;
	}
	
	public String toString() 
	{
		
		return "Estudante[Nome = " + getName() + ", Endereco = " + getAddress() + ", Programa = " + program + ", Ano = " + year + ", Taxa = " + fee + "]";
	}
	
	public static void main(String[] args)
    {


    }
}
