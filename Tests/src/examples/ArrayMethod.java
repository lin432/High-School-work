package examples;

public class ArrayMethod {
	
	public static int[] b;
	
	public ArrayMethod(int[] x)
	{
		b=x;
	}
	
	public static void print()
	{
		for (int x = 0; x<b.length; x++)
		{
			System.out.println(b[x]);
		}
	}

}
