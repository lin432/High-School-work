package examples;

public class Tester {

	
	public static void main(String[] args) {

		Student breton = new Student("lin",12);
		
		breton.setMark(20,20);
		breton.setMark(18,20);
		breton.setMark(19,23);
		breton.setMark(15,16);
		
		System.out.println(breton.average_percent());
		System.out.println(breton.average_mark());
	}

}
