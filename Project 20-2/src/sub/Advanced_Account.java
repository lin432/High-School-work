package sub;
import super_and_interface.*;
public class Advanced_Account extends Account implements Services {

	
	private int release = 0;
	private double minimium = 0;
	private int cheque_Amount = 0;
	private int cheque_Total = 0;
	private double tax;
	//Variables from both chequing account and savings account
	
	public Advanced_Account(short pin, String name, double interest,double taxrate) 
	{
		super(pin, name, interest, taxrate);
		tax = taxrate;
	}
	
	
	public void update(int month, int year)
	{//add decision for if month has changed so cheque amount doesn't reset artificially

		int date = month + 12*year;
		
		if(date > release){super.setTax(tax);}
		
		if(super.getBalance()>=minimium)
		{
			super.update(year);
			cheque_Amount = cheque_Total;
		}
		//resets amount of checks available
	}

	
	//chequing below
	public void setCheque(int number) {
		cheque_Total = (int) number;
		cheque_Amount = cheque_Total;
	}
	
	public void chequeWithdraw(double[] number) 
	{
		if(cheque_Amount == 0){			
			String reason = "Not enough cash";
			UnsupportedOperationException e = new UnsupportedOperationException(reason);
			throw e;}
		//checks if there's no cheque allowed
		
		else{
		for(int count = 0; count < number.length; count++)
		{
		
			if(cheque_Amount >0)
			{	//withdraws the amounts
				cheque_Amount -= 1;
				try	{super.withdraw(number[count]);}
				catch(UnsupportedOperationException e)
				{
					throw e;
				}
		}}}
	}

	
	public int getCheque(){return cheque_Amount;}
	
	

	public void timed(int month,int year, double taxrate) {
		release = month + 12*year;
		
		super.setTax(taxrate);
	}



	public void setMinimium(double min) {
		minimium = min;
		//sets minimum amount
	}

}
