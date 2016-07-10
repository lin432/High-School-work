package Inheritance;

public class Worker {

	private String name;
	private double rate;
	private int hours = 0;
	//variables
	
	public Worker(String Name, double Rate)
	{//sets the rate of pay and name
		this.name = Name;
		rate = Rate;
	}

	public int getHour(){return hours;}
	public String getName(){return name;}
	public double getRate(){return rate;}
	//get methods
	
	public double computePay(int hour)
	{//simple process, processing pay by hour
		double pay = rate * hour;

		return pay;
	}
	
	public void addHour(int hour)
	{//adds hours worked
		hours += hour;
	}
	
}
