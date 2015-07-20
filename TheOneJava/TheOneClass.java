import java.util.Random;
import java.util.Scanner;

public class TheOneClass {
	
	public static void N(){
		for(int i = 0; i < 5; i++){
			System.out.println("walking and... ");
		}
		for(int j = 3; j > 0; j--){
			System.out.println("climbing and...");
		}
		
		System.out.println("You make it to the top of a mountain and destroy the ring, but you lose a finger.");
		System.out.println("You won the game!  Good job.");
	}
	
	public static void E(){
		System.out.println("Enter a number between 1 and 9");
		Scanner scannertwo = new Scanner(System.in);
		
		int intput = scannertwo.nextInt();
		scannertwo.nextLine();
		
		if (intput > 2 && intput < 9){
			System.out.println("You hear horses approaching and hide.");
			System.out.println("The wraiths pass by and you head West");
			System.out.println("Enter any key to continue.");
			scannertwo.nextLine();
			W();
		}
		else{
			System.out.println("A wring wraith surprises you.  You lose.");
		}
		
		scannertwo.close();
	}
	
	public static void W(){
		System.out.println("You find some eagles.  They ask you for the secret code.");
		String secretcode = "friend";
		String guess;
		
		Scanner scannerthree = new Scanner(System.in);
		
		guess = scannerthree.nextLine();
				
		if(guess.equals(secretcode)){
			System.out.println("Correct!  The eagles give you a lift to the base of a mountain");
			System.out.println("Enter any key to continue.");
			scannerthree.nextLine();
			N();
		}
		else{
			System.out.println("Incorrect.  The eagles fly away.");
			System.out.println("You lose.");
		}
		
		scannerthree.close();
		
	}
	
	public static void S(){
		System.out.println("You come across two armies.  You join the forces of good.");
		
		int good = new Random().nextInt(200);
		int bad = new Random().nextInt(200);
		Scanner scannerfour = new Scanner(System.in);
		
		if(good > bad){
			System.out.println("Your forces overcome the forces of evil!");
			System.out.println("You turn north, toward a mountain");
			System.out.println("Enter any key to continue.");
			scannerfour.nextLine();
			N();
		}
		else if(bad > good){
			System.out.println("The forces of evil overcome your forces");
			System.out.println("You lose");
		}
		else{
			System.out.println("Forces are locked in an epic battle.");
			System.out.println("Do you (C)ontinue to fight or (R)un away?");
			String input = scannerfour.nextLine();
			while(!input.equals("C") && !input.equals("R")){
				System.out.println("Invalid choice");
				System.out.println("Do you (C)ontinue to fight or (R)un away?");
				input = scannerfour.nextLine();
			}
			if(input.equals("C")){
				int cointoss = new Random().nextInt(2);
				if(cointoss == 0){
					System.out.println("You win the battle but lose a leg.");
					System.out.println("You turn north, toward a mountain");
					System.out.println("Enter any key to continue.");
					scannerfour.nextLine();
					N();
				}
				else{
					System.out.println("The forces of evil overcome your forces");
					System.out.println("You lose");
				}
			}
			else{
				System.out.println("You run away and hide in a hole.  The evil forces win.");
				System.out.println("You lose.");
			}
			scannerfour.close();
		}
	}

	public static void main(String[] args) {
		// One Java program to rule them all
		
		int myInt = new Random().nextInt(2); //remember to import random
		if(myInt == 0){
			System.out.println("You are Frodo.");
		}
		else{
			System.out.println("You are Samwise.");
		}
		
		System.out.println("Your task is to destroy the One Ring.");
		
		System.out.println("Enter a direction: N, E, S, or W");
		Scanner myScanner = new Scanner(System.in);
		String input = myScanner.nextLine();
		while(!input.equals("N") && !input.equals("E") && !input.equals("S") && !input.equals("W")){
			System.out.println("Incorrect response.");
			System.out.println("Enter a direction: N, E, S, or W");
			input = myScanner.nextLine();
		}
		
		if(input.equals("N")){
			N();
		}
		else if(input.equals("E")){
			E();
		}
		else if(input.equals("W")){
			W();
		}
		else if(input.equals("S")){
			S();
		}

		
		myScanner.close();
	}

}
