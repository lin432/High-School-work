package sub;

import super_and_interface.*;

public class Chequing_Account extends Account implements Services, Information {

	private int cheque_Amount = 0;
	private int cheque_Total = 0;
	//cheque amounts
	
	public Chequing_Account(short pin, String name, double interest,double taxrate)
	{
		super(pin, name, interest, taxrate);
	}

	public void update(int years)
	{//add decision for if month has changed so cheque amount doesn't reset artificially
		super.update(years);
		cheque_Amount = cheque_Total;
		//resets amount of checks available
	}
	

	public void setCheque(int number) {
		cheque_Total = (int) number;
		cheque_Amount = cheque_Total;
	}

	public void timed(int month, int year, double taxrate) {
		String reason = "Unsupported on your account";
		UnsupportedOperationException e = new UnsupportedOperationException(reason);
		throw e;
	}

	public void setMinimium(double min) {
		String reason = "Unsupported on your account";
		UnsupportedOperationException e = new UnsupportedOperationException(reason);
		throw e;
	}

	public void chequeWithdraw(double[] number) 
	{
		
		for(int count = 0; count < number.length; count++)
		{
		
			if(cheque_Amount >0)
			{	
				cheque_Amount -= 1;
				try	{super.withdraw(number[count]);}
				catch(UnsupportedOperationException e)
				{
					throw e;
				}
		}}
	}

	
	public int getCheque(){return cheque_Amount;}
	

}
