package class_tests;

import java.util.Random;
import codes.TwoArrayMethods;

public class TwoDArrays {
	
	public static void main(String []args)
	{
		
		Random rndm = new Random();
		//random constructed
		
		double[] price = {10288.00,12999.99,18456.00,20345.00,45799.00};
		//set prices for car here, could've made an method to make it input but this is easier
		
		int[][] sales = new int[5][5];
		//create 2d array
		
		//I chose to leave nested loop out for ease to make it an input instead
		System.out.println("\t Model 1 \t Model 2 \t Model 3 \t Model 4 \t Model5");
		for(int row = 0; row<sales.length; row++)
		{
			System.out.print("Salesman " + (row+1) + "  ");
			for(int col = 0; col<sales[row].length; col++)
			{
				//can change limit of random but 30 seems respectable
				sales[row][col] = rndm.nextInt(30);
				System.out.print(sales[row][col]+ "\t");
			}
			System.out.println(" ");
		}
		
		//contructor for TAM down here since the sales are now stored
		TwoArrayMethods tam = new TwoArrayMethods(sales);
		double[] SalesbyPerson = new double[sales.length];
		double[] Salesbymodel = new double[sales[0].length];
		int persons = 0;
		int models = 0;
		int model2 = 0;
		int x = 0;
		
		System.out.println();
		System.out.println();
		//to make it prettier
		
		
		//calculates sale by person
		for(int person = 0; person<sales.length; person++)
		{
			SalesbyPerson[person] = tam.Sales(person);
			//calculate sale and print results
			System.out.println("Salesman " + (person+1) + " Sold " + SalesbyPerson[person]);
		
			if(SalesbyPerson[person]> SalesbyPerson[persons])
			{
				persons = person;
			}
		
		}
		

		System.out.println();
		System.out.println();
		
		//calculates sale by model
		for(int model = 0; model<sales[0].length; model++)
		{
			Salesbymodel[model] = tam.Modelsales(model);
			//calculates and prints results
			System.out.println("model " + (model+1) + " sold " + Salesbymodel[model]);
			
			if(Salesbymodel[model]> Salesbymodel[model])
			{
				models = model;
			}
		}
		
		for(int model = 0; model< sales[0].length; model++)
		{
			
			for(int person = 0; person< sales.length; person++)
			{
				x = x + sales[person][model]; 
			}

				if(model2< x )
				{
					model2 = model;
				}
		}
		

		System.out.println("Salesman " + (persons+1) + " made the most with " + SalesbyPerson[persons] + "dollars made" );
		System.out.println("Model " + (models+1) + " made the most with "+ Salesbymodel[models] + " dollars made");
		System.out.println("Model " + (model2+1) + "sold the most units with " + x + " units sold");
	}

}
/*	 Model 1 	 Model 2 	 Model 3 	 Model 4 	 Model5
Salesman 1  5	29	18	17	17	 
Salesman 2  4	14	12	11	27	 
Salesman 3  10	9	14	10	8	 
Salesman 4  19	21	23	25	2	 
Salesman 5  16	0	26	6	3	 


Salesman 1 Sold 1885095.71
Salesman 2 Sold 1904991.8599999999
Salesman 3 Sold 1048105.91
Salesman 4 Sold 1493182.79
Salesman 5 Sold 903931.0


model 1 sold 555552.0
model 2 sold 948999.27
model 3 sold 1716408.0
model 4 sold 1403805.0
model 5 sold 2610543.0
Salesman 2 made the most with 1904991.8599999999dollars made
Model 1 made the most with 555552.0 dollars made
Model 5sold the most units with 346 units sold
*/