import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);	
		
		System.out.println("Please enter your first name.");
		String firstName = input.nextLine();
		
		System.out.println("Please enter your last name.");
		String lastName = input.nextLine();
		System.out.println("Greetings, " + firstName + " "+ lastName + "!\n");
		
		System.out.println("What is your age?");
		String age = input.nextLine();
		System.out.println("You are " + age + " years-old." + "\n") ;
		
		
	
		System.out.println("What is your birth month? (Please enter a number for the month.)");
		String birthmonth = input.nextLine();
		
		System.out.println("What is your favorite ROYGBIV color?");
		String color = input.nextLine();
		
		System.out.println("Good choice!" + "\n"); 
		
		System.out.println(firstName + ", how many siblings do you have?");
		String siblings = input.nextLine();
		
 {
		System.out.println("You will retire in 25 years or more.");}
		
		; {
		System.out.println("You will retire in 25 years or less.");}
		
		
		
		
	}

	private static int input(String age) {
		// TODO Auto-generated method stub
		return 0;
	}

}
