package main;

public class BPJ_37_1_10 {
	
	public static void main(String[]args)
	{
		/* 1.
		 * if(amount>balance||amount<=0)
		 * {
		 * 	String s = "Number is greater than balance or less than or equal to 0";
		 * 	IllegalArgumentException e = new IllegalArgumentException(s);
		 * 	throw e;
		 * }  
		 */
		
		//3. We say the prgram threw an error
		
		//4.Checked expressions: ones Java requires a programmer to handle (java checks for them)
		//	Unchecked expression: Ones the programmer may incur and require the programmer to handle
		
		//5. Unchecked
		
		//6.Try,Catch it
		//	throw it
		
		//7. unessecary but I guess you could
		
		//8.an out put error using a java method
		
		//9. An example of Unchecked would be an infinite loop causing a crash
		

	}
	
	//2.
	public void setStudnetScore(int Score)
	{
		if(Score>100||Score<0)
		{
			String error = "Score is above 100 or under 0";
			IllegalArgumentException err = new IllegalArgumentException(error);
			throw err;
		}
	}
	
	//10.
	public String car(int xs)
	{
		try
		{
			int x = 0;
			
			x = x/xs;
		}
		catch(ArithmeticException b)
		{
			System.out.println("Arithmetic Error" + b);
		}
			return " cleared ";
	}
	

}
