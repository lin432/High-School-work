package classes;

public class Employee 
{

	public Employee(String name, double salary)
	{
		alias = name;
		income = salary;
	}
	//^ create variables
	
	public String name()
	{
		return alias;
	}
	//return name^
	
	public double salary()
	{
		return income;
	}
	//return income
	
	public double income;
	public String alias;
	//instances
}
