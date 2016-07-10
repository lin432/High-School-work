package Code;

public class Circle 
{
	public Circle(double r)
	{
		radius = r;
	}
	
	public double area()
	{
		double a = Math.PI * radius * radius;
		return a;
	}
	
	public double circumference()
	{
		double c = 2 * Math.PI * radius;
		return c;
	}
	
	public double radius;
}
