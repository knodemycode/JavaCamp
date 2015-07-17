package camp1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am a computer!");
		
		Scanner inputS = new Scanner(System.in);
		String something = inputS.nextLine();
		System.out.println(something);
		
		System.out.println("Hello I am "+5+" Years old");
		System.out.print("Hello I am ");
		System.out.print(5);
		System.out.print(" years old\n");
		
		inputS.close();
	}

}
