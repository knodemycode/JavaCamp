package camp5;

import java.util.Random;

public class Functions {
	
	public static void f(double x){
		double y = Math.pow(x, 2);
		System.out.println(y);
	}
	
	public static void print(String s){
		System.out.println(s);
	}
	
	public static void printTF(boolean b){
		if(b == true){
			print("CORRECT!");
		}
		else{
			print("INCORRECT!");
		}
	}
	
	public static void printTwoThings(String s1, String s2 ){
		if(s1.equals("Broccoli") && s2.equals("icecream")){
			System.out.println("NO.");
		}
		else{
			System.out.println(s1+s2);
		}
	}
	
	public static void vs(String s1, String s2){
		System.out.println(s1+" vs "+s2);
		int myInt = new Random().nextInt(2);
		
		if(s1.equals("Steampunk")){
			System.out.println(s1+" is the winner!");
		}
		else if(s2.equals("Steampunk")){
			System.out.println(s2+" is the winner!");
		}
		else if(myInt == 0){
			System.out.println(s1+" is the winner!");
		}
		else{
			System.out.println(s2+" is the winner!");
		}
	}
	
	public static void HAHA(){
		System.out.println("HAHA");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vs("George", "Foreman");
		vs("hi", "hi2");
		
		HAHA();
		
		
		/*
		vs("Steampunk", "Sloth" );
		
		
		printTwoThings("Steampunk", "sloth");
		printTwoThings("Candy", "salad");
		printTwoThings("Broccoli", "icecream");
		printTwoThings("Steampunk", "predator");
		
		f(42);
		f(13);
		f(7);
		for(int i = 1; i<=12; i++){
			f(i);
		}
		
		
		print("HELLO");
		
		printTF(true);
		*/
	}

}
