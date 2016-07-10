package twoD_array;

import java.util.Arrays;

public class Bp_lesson_35 {
	public static void main(String[] args)
	{
		//Exercise 1
		int a[][] = {{5,-16,9,21},{22,19,-101,36},{18,17,64,-2}};
		
		//Exercise 2
		System.out.println(a[1][2]);
		
		//Exercise 3
		System.out.println("d");
		
		//Exercise 4
		System.out.println(a.length);
		
		//Exercise 5
		System.out.println(a[2].length);
		
		//Exercise 6
		System.out.println(a[1][3]);
		System.out.println();
		
		//Exercise 7
		for(int row = 0; row < a.length; row++)
		{
			  for(int col = 0; col < a[row].length; col++)
			  {
				  System.out.print(a[row][col] + "\t");  
			  }
			  System.out.println(" ");
		}
		
		//Exercise 8
		Arrays.sort(a[0]);
		System.out.println(Arrays.binarySearch(a[0],5));
		
		//Exercise 9
		Arrays.sort(a[0]);
		System.out.println( Arrays.binarySearch(a[0],0));
		
		//Exercise 10
		for(int row = 0; row<a.length; row++)
		{
			for(int col =0; col< a[row].length; col++)
			{
				a[row][col] = row*col;
				  System.out.print(a[row][col] + "\t"); 
			}
			System.out.println(" ");
		}
	}

}

/*
 -101
d
3
4
36

5	-16	9	21	 
22	19	-101	36	 
18	17	64	-2	 
1
-2
0	0	0	0	 
0	1	2	3	 
0	2	4	6	 

 */
