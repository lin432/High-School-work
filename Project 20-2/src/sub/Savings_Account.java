package sub;

import super_and_interface.*;

public class Savings_Account extends Account implements Services {

	
	private int release = 0;
	private double minimium;
	private double tax;
	
	public Savings_Account(short pin, String name, double interest,double taxrate) 
	{
		super(pin, name, interest, taxrate);
		
		tax = taxrate;
	}

	
	public void update(int month,int year)
	{
		int date = month + 12*year;
		
		if(date > release){super.setTax(tax);}
		
		
		else{if(super.getBalance()>=minimium)
		{super.update(year);}
		}
	}
	
	


	public void setCheque(int number) {
		String reason = "Your account does not support this";
		UnsupportedOperationException e = new UnsupportedOperationException(reason);
		throw e;
	}



	public void chequeWithdraw(double[] number) {
		String reason = "Your account does not support this";
		UnsupportedOperationException e = new UnsupportedOperationException(reason);
		throw e;
	}



	public void timed(int month,int year, double taxrate) {
		release = month + 12*year;
		
		super.setTax(taxrate);
	}



	public void setMinimium(double min) {
		minimium = min;
	}

}
