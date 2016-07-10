package Classes;

public class Employee {

		public Employee(String name, int pay)
		{
			alias = name;
			wage = pay;
		}//^constructor
		
		public void weeklywage(int hour, int store)
		{
			double pay;
			//^temp variable
			
			if(hour>20)
			{
				int newhour = hour - 20;
				pay = wage * 20;
				pay= wage*1.5 * newhour + pay;
			}//^creates overtime
			else
			{
				pay = wage * hour;
			}//^else does regular pay
			
			this.hour[store] = hour;
			carry[store] = pay;
			//^stores info
		}
		
		public void resultsname()
		{	
			int total = 0;
			//^temp variable
			
			System.out.println(alias);
			System.out.println("\nRate of pay is: " + wage + "/hr");
			//^prints name
			for(int c = 0; c<carry.length; c++)
			{
			if(carry[c]!= 0)
			{
				System.out.println("Week:" + (c+1) + "\t\ttotal pay: " + carry[c] + "\thours worked: " + hour[c]);
			}
			//^prints lines of information for week pay and hours worked
			
			total+=carry[c];
			//^adds totals to print total pay recieved
			}
			
			System.out.println("total pay is: " + total);
			//^prints total pay
		}

		public int wage;
		public int []hour = new int[52];
		public double []carry = new double[52];
		public String alias;
		//^variables
}
