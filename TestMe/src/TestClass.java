import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		  System.out.println("Hello World");
		  Integer number1 = 1234;
		  Integer number2 = 100;
		  
		  SubClass subClass = new SubClass();
		  Integer sum = subClass.subtractNumbers(number1, number2);
		  System.out.println(sum);
		  
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Name:");
		  String name = input.next();
		  
		  System.out.println("Country:");
		  
		  String country = input.next();
		  
		  System.out.println("Work:");
		  
		  String work = input.next();
		  

		  System.out.println(name + " is from " + country + " and he worts at " + work);
		  
		
		  
	
		  
		  
		
	}

}
