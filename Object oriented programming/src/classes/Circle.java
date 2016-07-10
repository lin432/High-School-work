package classes;

public class Circle {
	
	//Constructor
	public Circle(double r)
	{
		radius=r;
	}
	
	//Method
	public double area()
	{
		double a = Math.PI * radius * radius;
		return a;
	}
	
	//Method
	public double circumference()
	{
		double c = 2 * Math.PI * radius;
		return c;
	}
	
	//Method
	public double diameter()
	{
		double d = radius * 2;
		return d;
	}
	
	//State variable
	public double radius;
}
