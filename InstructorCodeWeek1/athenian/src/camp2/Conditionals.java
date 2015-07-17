package camp2;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		/*
		
		System.out.println("Answer me these questions three");
		System.out.println("WHAT is your name?");
		String input = myScanner.nextLine();
		
		System.out.println("WHAT is your quest?");
		
		System.out.println("WHAT is your favorite color?");
		input = myScanner.nextLine();
		
		
		if(input.equals("yellow") || input.equals("YELLOW")){
			System.out.println("You cross the bridge!");
		
		}
		else{
			System.out.println("You are cast into the gorge of eternal peril.");
			System.out.println("You lose!");
		}
		*/
		
		// less than: <
		// greater than: >
		// equal to: ==
		// greater than or equal to: >=
		// less than or equal to: <=
		// not equal to: !=
		
		double num1 = 5;
		double num2 = 6;
		
		if(num2 == 0){
			System.out.println("Can't divide by zero. Changing to 1");
			num2 = 1;
		}
		
		System.out.println(num1/num2);
		
		String name = "Mary";
		
		if(name.equals("Mary") || name.equals("Bob") || name.equals("MaryBob")){
			System.out.println("You weren't invited!");
		}
		else if(name.equals("Mary")){
			System.out.println("Mary two");
		}
		else{
			System.out.println("Have a great time!");
		}
		
		System.out.println("Tell me what you got on the test");
		
		int score = myScanner.nextInt();
		
		if(score >= 100){
			System.out.print("perfect score!");
		}
		else if(score >= 90){
			System.out.println("You got a b");
		}
		else if(score >= 80){
			System.out.println("That's the real b");
		}
		else{
			System.out.println("good try");
		}
		
		
		
		
		myScanner.close();
		

	}

}
