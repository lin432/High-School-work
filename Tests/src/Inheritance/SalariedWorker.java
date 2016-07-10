package Inheritance;

public class SalariedWorker extends Worker{

	private int weeks = 0;
	//weeks to hold weeks worked
	
	public SalariedWorker(String Name, double Rate) {
		super(Name, Rate);
	}//constructor

	
	public double computePay(int hour)
	{//adds one to weeks worked and then computes pay by 40 hours regardless of hours added
		weeks++;
		super.addHour(hour);
		return super.computePay(40);
	}
	
	public double getTotal()
	{//since all the weeks are payed by 40 hours
		//I shortcuted and used weeks to calculate total
		return super.computePay(weeks*40);
	}
	
}
