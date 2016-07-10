/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 21, 2012
 *
 * Purpose   Use the for loop or should I say don't
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package codes;

public class lesson_11 {

	public static void main(String[] args){
		
		System.out.println("the textbook says print answer and don't write code unless otherwise");
		
		//Question 1
		System.out.println(  );
		System.out.println("j would equal 5");
		
		//Question 2
		System.out.println(  );
		System.out.println("s would equal 10");
		
		//Question 3
		System.out.println(  );
		System.out.println("m would equal 45");
		
		//Question 4
		System.out.println(  );
		System.out.println("a would equal 3^9 (I'm lazy and I don't want to calculate)");
		System.out.println("j would equal 8");
		
		//Question 5
		System.out.println(  );
		System.out.println("b would equal 235");
		
		//Question 6
		System.out.println(  );
		System.out.println("d would equal 110.01");

		//Question 7
		System.out.println(  );
		
		int ans = 3;
		
		System.out.println(ans);
		
		for (int space = 0;space<3;space++)
		{
			ans = ans+ans;
			System.out.println(ans);
		}
		
		//Question 8
		System.out.println(  );
		
		ans = 48;
		
		for (int ss = 0;ss<4;ss++)
		{
			ans= ans-(ans/2);
			System.out.println(ans);
		}
		
		//Question 9
		System.out.println(  );
		System.out.println("k is equal to 4");
		
		//Question 10
		System.out.println(  );
		System.out.println("The part that ends the loop is called the control expression");
	}
}

/*
System run:

the textbook says print answer and don't write code unless otherwise

j would equal 5

s would equal 10

m would equal 45

a would equal 3^9 (I'm lazy and I don't want to calculate)
j would equal 8

b would equal 235

d would equal 110.01

3
6
12
24

24
12
6
3

k is equal to 4

The part that ends the loop is called the control expression


*/