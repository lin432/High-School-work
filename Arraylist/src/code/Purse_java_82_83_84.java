package code;

import objects.Purse;

public class Purse_java_82_83_84 {

	public static void main(String[]args)
	{
		Purse purse = new Purse();
		Purse pur = new Purse();
		//create 2 objects
		
		//8.2
		purse.addCoin("Quarter");
		purse.addCoin("Dime");
		purse.addCoin("Nickel");
		purse.addCoin("Dime");
		//adding coins
		
		System.out.println(purse.toString());
		//print
		
		purse.reversePurse();
		//reverse
		
		System.out.println(purse.toString());
		//print
		
		
		pur.addCoin("Dime");
		pur.addCoin("Nickel");
		//add to second purse
		
		purse.transfer(pur);
		//transfer
		
		
		System.out.println(purse.toString());
		System.out.println(pur.toString());
		//print
		
		
	}
	
}
