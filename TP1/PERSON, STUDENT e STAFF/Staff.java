//Wesley Oliveira CB300550X

public class Staff extends Person {
	

	private String school;
	private double pay;
	
	Staff(String n, String add, String sc, double p) {
		super(n, add);
		this.school = sc;
		this.pay = p;
	}
	
	public String getSchool() 
	{
		return school;
	}
	
	public void setSchool(String sc) 
	{
		school = sc;
	}
	
	public double getPay()
	{
		return pay;
	}
	
	public void setPay(double p)
	{
		pay = p;
	}
	
	public String toString()
	{
		return "Funcionario[Nome = " + getName() + " Endereco = " + getAddress() + ", Escola = " + school + ", Salario = " + pay + "]";
	}
	public static void main(String[] args)
    {
		
    }
}
