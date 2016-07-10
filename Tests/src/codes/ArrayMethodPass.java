package codes;

import examples.ArrayMethod;

public class ArrayMethodPass {

	public static void main(String[] args)
	{
		int[] x = new int[20];
	
			for(int v = 0; v<x.length;v++)
			{
				x[v]=x.length-v;
			}
		
		ArrayMethod b = new ArrayMethod(x);
		
		ArrayMethod.print();
	}
	
}
