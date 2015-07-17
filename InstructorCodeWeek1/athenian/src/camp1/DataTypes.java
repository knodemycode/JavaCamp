package camp1;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// data types apply to variables
		// variables are symbols that represent some value
		// you can change the value of a variable
		/*
		String Dave;
		Dave = "7";
		Dave = "doge";
		
		int Dave2;
		Dave2 = 16;
		
		Dave2 = -16;
		
		double Jim;
		Jim = 42.42;
		
		Jim = 40;
		
		int Dave3 = 5;
		Dave3 = 7;
		
		boolean lieDetector;
		lieDetector = true;
		lieDetector = false;
		
	
		
		int Jimbo, Samuel, answer;
		Jimbo = 4;
		Samuel = 17;
		
		answer = Jimbo - Samuel;
		System.out.println(answer);
		
		answer = Samuel + Jimbo + Jimbo;
		System.out.println(answer);
		
		answer = Samuel * Jimbo;
		System.out.println(answer);
		
		answer = Jimbo/Samuel;
		System.out.println(answer);
		
		double answer2;
		double Jimbo2 = 4;
		double Samuel2 = 17;
		answer2 = Jimbo2/Samuel2;
		System.out.println(answer2);
		
		//Question 1
		double whatever = 6*7;
		System.out.println(whatever);
		
		System.out.println(6*7);
		
		int one, two;
		one = 6;
		two = 7;
		
		int answer8 = 6*7;
		System.out.println(answer8);
		
		//Question 2
		double o, t, three, four, five, a1, a2, a3, a4;
		o = 2;
		t = 4;
		three = 6;
		four = 7;
		five = 3;
		
		a1 = o * t;
		a2 = three*four;
		a3 = (a1 + a2);
		a4 = a3/3;
		System.out.println(a4);
		
		double w = ((2.0*4.0) + (6.0*7.0))/3.0;
		System.out.println(w);
		
		System.out.println(((2.0*4.0)+(6.0*7.0))/3.0);
		*/
		
		// Operations with Strings 
		
		String theString = "hello";
		String theString2 = "goodbye";
		
		String theNewString = theString + theString2;
		
		System.out.println(theNewString);
		
		char theChar = theString2.charAt(6);
		System.out.println("My char is "+theChar);
		
		String newString = theString.substring(1, 3);
		System.out.println(newString);
		
		
		
		//pig latin
		char theFirst = theString.charAt(0);
		String theRest = theString.substring(1);
		
		System.out.println(theRest+theFirst+"ay");

	}

}
