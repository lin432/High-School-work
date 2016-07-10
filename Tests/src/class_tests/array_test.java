package class_tests;

public class array_test 
{
	public array_test(int temporary)
	{
		temporary = variable;
	}
	
	
	public int sam(int [] test)
	{
		int returnvar = 0;
		
		for(int count = 0; count<test.length;count++)
		{
			returnvar+=test[count];
		}
		
		
		return returnvar;
	}
	
	public int variable;
	
}
