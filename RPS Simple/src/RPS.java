import javax.swing.JOptionPane;


public class RPS {
	static int score;
	static int computerChoice;
	static int choice;
	public RPS() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		score = 0;
		Object[] options = {"Rock!",
			"Paper!",
            "Scissors!"};  //Different choices for buttons
		int n = 0;
		while(n==0){
			choice = JOptionPane.showOptionDialog(null, //type of frame
				"The computer is waiting for your move \n Score: "+score, // Text you want to print
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
			checkIfWin();
		}
	}
	private static void checkIfWin() {
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
		 *  - choice
		 *  - score
		 * computerChoice and choice have values 0-2 which correspond to "Rock", "Paper", or "Scissors"
		 * score is a normal integer that keeps track of the score
		 * 
		 * Input code after the comment
		 */
		
	}
}
