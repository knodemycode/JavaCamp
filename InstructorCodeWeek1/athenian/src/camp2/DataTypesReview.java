package camp2;

import java.util.Random;
import java.util.Scanner;

public class DataTypesReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		int firstInt = 6;
		int secondInt = 7;
		System.out.println(firstInt*secondInt);
		
		System.out.println(firstInt/secondInt);
		
		double firstD = 6;
		double secondD = 7;
		System.out.println(firstD/secondD);
		
		double first1 = 2*4;
		double second2 = 6*7;
		double third = first1 + second2;
		double answer = third/3;
		System.out.println(answer);
		
		System.out.println(((2.0*4.0)+(6.0*7.0))/3.0);
		
		double distanceToFuel = 300;
		double totalDistance = 1000000;
		answer = totalDistance / distanceToFuel;
		
		System.out.println(answer);
		
		
		int D20;
		int D6;
		
		Random myRandom = new Random();
		D6 = myRandom.nextInt(6) + 1;
		
		System.out.println(D6);
		
		D20 = myRandom.nextInt(20) +1;
		System.out.println(D20);
		
		
		
		String Pluto = "dwarf";
		String Mars = "blah";
		
		String result = Pluto + Mars;
		
		System.out.println(result);
		
		//echo game
		
		String input = myScanner.nextLine();
		
		System.out.println(input);
		
		
		Scanner myScanner = new Scanner(System.in);
		//pig latin
		System.out.println("Tell me a word and I will tell you what it is in pig latin");
		String pig = myScanner.nextLine();
		
		char pig2 = pig.charAt(0);
		String pig3 = pig.substring(1);
		
		String latin = pig3 + pig2 + "ay";
		
		System.out.println(latin);
		
		myScanner.close();
		*/
		
		boolean myBool = true;
		myBool = false;
		
		boolean myBool2 = true && true;
		System.out.println(myBool2);
		
		myBool2 = true && false;
		System.out.println(myBool2);
		
		myBool2 = false && false;
		System.out.println(myBool2);
		
		boolean mb3 = true || true;
		System.out.println(mb3);
		
		mb3 = true || false;
		System.out.println(mb3);
		
	}

}
