package classes;

public class Student extends Person{
	
	private String major;
	
	private String description = "A person who inquires for information and then lets it go out the other ear";
	
	public Student(int year, String name)
	{
		super(year,name);
	}
	
	public void set_major(String major)
	{
		this.major = major;
	}
	
	public String toString()
	{
		String hold = "Student: " + description + " This one is studying " + major + " \nhe/she is called " + name + " he/she was born " + year;
		return hold;
	}

}
