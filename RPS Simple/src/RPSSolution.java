import javax.swing.JOptionPane;
import javax.swing.Spring;


public class RPSSolution {
	static int score;
	static int computerChoice;
	static int choice;
	static String lastComputerChoice;
	public RPSSolution() {}
	public static void main(String[] args){
		score = 0;
		Object[] options = {"Rock!",
			"Paper!",
            "Scissors!"};  //Different choices for buttons
		int n = 0;
		lastComputerChoice ="";
		while(n==0){
			choice = JOptionPane.showOptionDialog(null, //type of frame
				"The computer is waiting for your move \n Score: "+score+"\n Last Computer Choice: "+ lastComputerChoice, // Text you want to print
				"Rock! Paper! Scissors!", //Header text
				JOptionPane.YES_NO_CANCEL_OPTION, //Type of options. This is for multiple options
				JOptionPane.PLAIN_MESSAGE, //Type of message, generally use JOptionPane.PLAIN_MESSAGE
				null, // Icon to go with the frame
				options, //List of options
				options[0] //Default option
			);
			if(choice == JOptionPane.CLOSED_OPTION){
				n=1;
				System.exit(0);
			}
			else{
				computerChoice = (int) (Math.random()*3);
			}
			setLastComputerChoice();
			checkIfWin();
		}
	}
	private static void setLastComputerChoice() {
		if(computerChoice == 0){
			lastComputerChoice = "Rock";
		}
		else if(computerChoice == 1){
			lastComputerChoice = "Paper";
		}
		else if(computerChoice == 2){
			lastComputerChoice = "Scissors";
		}
		
	}
	private static void checkIfWin() {
		// TODO
		/* Make an if/else if/else statement
		 * that checks if you beat the computer.
		 * 
		 * The following are the numbers that correspond to "Rock", "Paper", and "Scissors"
		 * Rock = 0
		 * Paper = 1
		 * Scissors = 2
		 * 
		 * If you win, increase score by 1
		 * If you lose, decrease score by 1
		 * If you tie, don't change score
		 * 
		 * The variables that are already defined are
		 *  - computerChoice
		 *  - score
		 * Both have values 0-2 which correspond to "Rock", "Paper", or "Scissors"
		 * 
		 * Input code after the comment
		 */
		if(choice == 0){
			if(computerChoice == 1){
				score--;
			}
			else if(computerChoice == 2){
				score++;
			}
		}
		else if(choice == 1){
			if(computerChoice == 0){
				score++;
			}
			else if(computerChoice == 2){
				score--;
			}
		}
		else if(choice == 2){
			if(computerChoice == 0){
				score--;
			}
			else if(computerChoice == 1){
				score++;
			}
		}
	}
}
