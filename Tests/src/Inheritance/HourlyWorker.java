package Inheritance;

import java.util.*;

public class HourlyWorker extends Worker{

	ArrayList<Double> pay = new ArrayList<Double>();
	//list to hold all payments
	
	public HourlyWorker(String Name, double Rate) {
		super(Name, Rate);
	}//constructor
	
	public double computePay(int hours)
	{//adds hours to hours worked first
		super.addHour(hours);
		
		//checks if hours worked is greater than 40
		if(hours>40)
		{
			//computes 40hours pay and then the rest at 1/2 the rate
			double pay = super.computePay(40);
			pay += (hours-40) * (super.getRate()/2);
			
			this.pay.add(pay);
			//adds to list and returns pay
			return pay;
		}
		else
		{
			//goes through super method, is added to list and is returned to main
			double pay = super.computePay(hours);
			this.pay.add(pay);
			return pay;
		}
	}
	
	public double getTotal()
	{
		//processes info and gets total 
		double total = 0;
		for(int count = 0; count< pay.size(); count++)
		{
			total += pay.get(count);
		}
		
		return total;
	}
	

}
