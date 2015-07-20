
package leetspeak;

import java.util.Scanner;


public class LeetSpeak {

public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word to translate to L33T: ");
		String sentence = scan.nextLine();
		String result = "This is the translated word: "; 
 
		for (int i = 0; i < sentence.length(); i++) {
 
			result += translate(sentence.substring(i,i+1));
 
		}
 
		 System.out.println(result);
	}
 
 
 
 
 
	public static String translate (String str) { 
 
		String result = ""; 
		String[] english = {"a", "B", "C", "d", "E", "f", "G", "g", "H", "I", "i", "j", "k", "L",  "m", "n", "o", "p", "q", "R", "S", "T", "u", "w", "x", "y", "Z"};
		String[] leet = {"@", "8" , "c" , "d", "3", "f", "6", "9", "h", "!" , "1", "j", "k", "l", "m", "n", "0", "p", "9", "r", "$" , "t", "u", "w", "x", "y", "z"}; 
 
		for (int i = 0; i < english.length; i++) {
 
			if (str.equalsIgnoreCase(english[i])){
 
				result += leet[i];
 
			} 
 
		}
 
		return result;
		}
}
