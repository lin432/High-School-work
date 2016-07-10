package examples;

public class Student {
	
	public Student (String inName, int inAge)
	{
		name = inName;
		age = inAge;
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAttendance() {
		return attendance;
	}
	
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark,int total) 
	{
		this.mark = mark;
		this.total += total;
		this.allMarks+=mark;
		this.entries++;
	}

	public double average_percent ()
	{
		double returnvar;
		
		returnvar = (double) allMarks / total;
		
		return returnvar;
	}
	
	public double average_mark()
	{
		double returnvar;
		
		returnvar = allMarks/entries;
		
		return returnvar;
	}
	
	
	private String name;
	private int age;
	private int attendance;
	private int mark;
	private int total;
	private int allMarks = 0 ;
	private int entries = 0;
}
