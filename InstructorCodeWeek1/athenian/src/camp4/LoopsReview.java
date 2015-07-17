package camp4;

import java.util.Scanner;
import java.util.Random;

public class LoopsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		while(1 == 1){
			System.out.println("anything");
		}
		*/
		
		//secret code to stop
		
		Scanner myScanner = new Scanner(System.in);
		/*
		String secretCode = "java";
		String codeGuess = "no";
		
		while(!secretCode.equals(codeGuess)){
			System.out.println("Enter password:");
			codeGuess = myScanner.nextLine();
			
		}
		*/
		
		/*
		int secretCode = 2525;
		int codeGuess = 0;
		int guessLimit = 5;
		int guessesSoFar = 0;
		
		while((codeGuess != secretCode) && (guessesSoFar != guessLimit)){
			System.out.println("Enter password: ");
			codeGuess = myScanner.nextInt();
			guessesSoFar++;
		}
		*/
		
		/*
		
		int myInt = new Random().nextInt(10) + 1;
		int guess = -1;
		int counter = 0;
		
		while(myInt != guess && counter < 3 ){
			System.out.println("guess my number");
			guess = myScanner.nextInt();
			counter = counter + 1;
			
			if(guess < myInt){
				System.out.println("too low");
			}
			else if(guess > myInt){
				System.out.println("too high");
			}
		}
		
		if(myInt == guess ){
			System.out.println("good job!");
		}
		else{
			System.out.println("ran out of guesses");
		}
		
		
		
		
		int county = 0;
		while (county < 10){
			county = county + 1;
			//county++;
			System.out.println("hi");
		}
		
		
		for(int counter = 0; counter < 10; counter++ ){
			System.out.println("hi");
		}
		
		
		//sleep for eight hours
		for(int counter = 0; counter < 8; counter++){
			System.out.println("zzzz");
		}
		
		System.out.println("you get three meals a day");
		for(int counter = 0; counter < 3; counter++){
			//person.feed(hamburgers);
		}
		
		for(int counter=0; counter < 5; counter++){
			System.out.println("go to school!");
		}
		
		for(int i=10; i>0; i--){
			//this loop counts down
			System.out.println(i);
		}
		
		//it is the same as this while loop
		int i =10;
		while (i > 0){
			System.out.println(i);
			i--;
		}
		
		for(int j = 0; j < 100; j+=5){
			System.out.println(j);
		}
		
		
		//kirby dance 10 times; up or down doesn't matter
		for(int i = 10; i > 0;  i--){
			System.out.println("<(  ' ' <)");
			System.out.println("^(  ' ' )^");
			System.out.println("(>  ' ' )>");
		}
		*/
		for(int i =0; i<9001; i++){
			for(int j=0; j<9001; j++){
				//person.takeSelfie();
				System.out.print("8");
			}
			System.out.print("\n");
		}
		myScanner.close();
	}

}
