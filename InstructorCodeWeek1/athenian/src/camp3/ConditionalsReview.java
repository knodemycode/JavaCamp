package camp3;

import java.util.Scanner;

public class ConditionalsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		//Problem 1
		/*
		
		System.out.println("Tell me an integer.");
		
		
		
		int myInt = myScanner.nextInt();
		
		if(myInt < 0){
			myInt = 0;
		}
		
		System.out.println(myInt);
		*/
		
		//Problem 2
		
		System.out.println("WHAT is your name?");
		
		String name = myScanner.nextLine();
		
		if(!(name.equals("Benjamin") || name.equals("benjamin"))){
			System.out.println("You are cast into the gorge of eternal peril!");
		}
		else{
			System.out.println("WHAT is your quest?");
			String quest = myScanner.nextLine();
			
			if(!(quest.equals("Eat the pie") || quest.equals("eat the pie") || quest.equals("seek the holy grail"))){
				System.out.println("You are cast into the gorge of eternal peril!");
			}
			else{
				System.out.println("WHAT is your favourite colour?");
				String color = myScanner.nextLine();
				if(!color.equals("brown")){
					System.out.println("You are cast into the gorge of eternal peril!");
				}
				else{
					System.out.println("You may continue.");
				}
			}
			
				
		}
		
		
		
		myScanner.close();

	}

}
