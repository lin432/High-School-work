package class_tests;

public class Card {

	private int G3D;
	private double price;
	private String name;
	
	public Card(int performance,double price,String title)
	{
	G3D = performance;
	this.price = price;
	name = title;
	}
	
	public int getG3D()
	{return G3D;}
	
	public double getPrice()
	{return price;}
	
	public String getTitle()
	{return name;}
}
