package camp3;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		
		//this is an infinite loop.  commented out for our safety.
		/*
		while(1 == 1){
			System.out.println("Maniacal laugh!");
		}
		*/
		
		/*
		System.out.println("give me a number to divide by");
		
		double myNumber = myScanner.nextDouble();
		
		while(myNumber == 0){
			System.out.println("give me a number to divide by.  you can't divide by zero");
			myNumber = myScanner.nextInt();
		}
		
		System.out.println("Three divided by "+myNumber+" is "+3/myNumber);
	*/
		/*
		String conti = "yes";
		
		while(conti.equals("yes")){
			System.out.println("<( ' ' <)");
			System.out.println("          ^( ' ' )^");
			System.out.println("                   (>  ' ')>");
			
			System.out.println("Dance again?");
			conti = myScanner.nextLine();
			
		}
		*/
		
		int counter = 0;
		String myColor = "white";
		String guess = "nope";
		int countdown = 3; //if you wanted to do guesses left instead
		
		while(counter < 3 && !myColor.equals(guess)){
			System.out.println("What is my favorite color?");
			guess = myScanner.nextLine();
			
			counter = counter + 1;
			countdown = countdown - 1;
			//countdown--;
			
			if(myColor.equals(guess)){
				System.out.println("correct!");
				//counter = 3; //another way to exit on correct answer
			}
			else if(counter < 3){
				System.out.println("Try again. "+counter+" guesses used.");
			}
			
		}
		
		if(myColor.equals(guess)){
			System.out.println("good job!");
		}
		else{
			System.out.println("you will be terminated!  The end.");
		}
		
		
	}

}
