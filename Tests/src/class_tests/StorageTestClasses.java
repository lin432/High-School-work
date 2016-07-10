package class_tests;

public class StorageTestClasses {

	public static void main(String[]args)
	{
		Card b = new Card(2,2.0,"b");
		Card a = new Card(1,1.0,"a");
		Card c = new Card(3,3.0,"c");
		
		
		System.out.println("clear a");
		MasterArray m = new MasterArray();
		System.out.println("clear b");
		m.addCard(a);
		System.out.println("clear c");
		m.addCard(b);
		System.out.println("clear d");
		m.addCard(c);
		System.out.println("clear e");
		m.printString();
		System.out.println("clear f");

	}
	
}
