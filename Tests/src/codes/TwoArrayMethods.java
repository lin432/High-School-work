package codes;

public class TwoArrayMethods {
	
	public int array[][];
	public double[] price = {10288.00,12999.99,18456.00,20345.00,45799.00};
	//set prices for car here, could've made an method to make it input but this is easier
	
	
	public TwoArrayMethods (int[][] x)
	{
		array = x;
	}//copy array
	
	public double Sales (int person)
	{double SaleTotal = 0;
			for(int model = 0; model<array[person].length; model++)
			{//adds money
				SaleTotal = SaleTotal + (array[person][model] * price[model]);
			}
			
		return SaleTotal;
	}//returns
	
	public double Modelsales (int model)
	{	double Saletotal = 0;
		
		for(int person = 0; person<array.length; person++)
		{//adds money
			Saletotal = Saletotal + (array[person][model] * price[model]);
		}
		//returns
		return Saletotal;
	}
	

}
