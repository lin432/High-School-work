/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 15, 2012
 *
 * Purpose   get used to boolean
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package codes;

public class Lesson_8 {

	public static void main(String[] args){
		
		//for examples 1-10
		
		int x =79, y=46, z=-3;
		double  d=13.89, jj=40;
		boolean b = true, c = false;
		
		//Example 1
		System.out.println((b)&&(c));
		
		//Example 2
		System.out.println(  );
		System.out.println((b)&&(!c));
		
		//Example 3
		System.out.println(  );
		System.out.println(c||(d>0));
		
		//Example 4
		System.out.println(  );
		System.out.println(!b||c);
		
		//Example 5
		System.out.println(  );
		System.out.println((x>102)&& b);
		
		//Example 6
		System.out.println(  );
		System.out.println((jj==1)||false);
		
		//Example 7
		System.out.println(  );
		System.out.println((jj==40)&&!false);
		
		//Example 8
		System.out.println(  );
		System.out.println(x!=3);
		
		//Example 9
		System.out.println(  );
		System.out.println(!(x!=3));
		
		//Example 10
		System.out.println(  );
		System.out.println(!!true);
		
		//Questions
		System.out.println("\nQuestion's start here: " );
		
		z=23; x=-109;
		double c2= 2345.19, v=157.03;
		boolean a = false, s = true;
		
		//Question 1 
		
		boolean gus = (x>0)&&(c2==v);
		
		System.out.println(!gus);
		
		//Question 2
		System.out.println(  );
		
		System.out.println(a||s);
		
		//Question 3
		System.out.println(  );
		
		System.out.println(((-1*x)>0)&&!a);
		
		//Question 4
		System.out.println(  );
		
		boolean r = z ==x;
		System.out.println(r||false);
		
		//Question 5
		System.out.println(  );
		
		System.out.println(z!=x);
		
		//Question 6
		System.out.println(  );
		
		System.out.println((!false&&false) + " " + (false||!false));
		System.out.println((!false&&true) + " " + (false||!true));
		System.out.println((!true&&false) + " " + (true||!false));
		System.out.println((!true&&true) + " " + (true||!true));
		
		//Question 7
		System.out.println(  );
		
		boolean p = true, q = false, b2 = p&&q;
		System.out.println(b2);
		
		//Question 8
		System.out.println(  );
		
		boolean w = (x!=-1)||(y==z);
		System.out.println(w);
		
		//Question 9
		System.out.println("\nthe two possible values of boolean are true or false");
		
		//Question 10
		System.out.println(  );
		
		int a2 = 24, b3 = 36;
		boolean kDog = a2!=b3;
		
		System.out.println(kDog);
		
		//Question 11
		System.out.println(  );
		
		kDog = b3!=a2;
		System.out.println(kDog);
		
		//Question 12
		System.out.println("\nthe java operator for AND-ing is &&");
		
		//Question 13
		System.out.println("\nthe java operator for OR-ing is ||");
		
		//Question 14
		System.out.println(  );
		
		System.out.println((true&&false)||((true&&true)||false));
		
		//Question 15
		System.out.println(  );
		
		System.out.println(true && true || false);
		
		//Question 16
		System.out.println(  );
		
		System.out.println(true||true && false);
		
		//Question 17
		System.out.println(  );
		
		System.out.println(false || true && false);
		
		//Question 18
		System.out.println(  );
		
		System.out.println(false && true || false);
	}
}

/*
System run:

false

true

true

false

false

false

true

true

false

true

Question's start here: 
true

true

true

false

true

false true
true false
false true
false true

false

true

the two possible values of boolean are true or false

true

true

the java operator for AND-ing is &&

the java operator for OR-ing is ||

true

true

true

false

false

*/