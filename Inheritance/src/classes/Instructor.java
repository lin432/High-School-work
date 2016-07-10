package classes;

public class Instructor extends Person {
	
	private double salary;
	
	private String description = "A person who teaches students to make a living";
	
	public Instructor(int year, String name)
	{
		super(year,name);
	}
	
	public void set_salary(double salary)
	{
		this.salary = salary;
	}
	
	public String toString()
	{
		String hold ="Instructor: " + description + " this one makes $" + salary + " a year\n his/her name is " + name + " he/she was born " + year ;
		return hold;
	}

}
