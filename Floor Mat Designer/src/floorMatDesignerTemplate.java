
public class floorMatDesignerTemplate {
	static String[][] basicDesign, reversedHorizontal, reversedVertical, totalDesign, rotated;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}

	private static void run() {
		// TODO Auto-generated method stub
		basicDesign = randomDesign(5,4);
		makeDesign(2,2);
		System.out.print(toString(totalDesign));
		
	}

	private static String[][] randomDesign(int a, int b) {
		reversedHorizontal = new String[a][b];
		reversedVertical = new String[a][b];
		rotated = new String[a][b];
		String[][] basicPattern = new String[a][b];
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
				int x = (int) (Math.random()*4);
				if(x == 0){
					basicPattern[i][j] = "X";
				}
				else if(x == 1){
					basicPattern[i][j] = "O";
				}
				else if(x == 2){
					basicPattern[i][j] = "/";
				}
				else if(x == 3){
					basicPattern[i][j] = "\\";
				}
			}
		}
		
		return basicPattern;
	}
	public void flipHorizontal(){
		/* make a subdesign that is the basicDesign flipped horizontally */
	}
	public void flipVertical(){
		/* make a subdesign that is the basicDesign flipped vertically */
	}
	public void rotate180(){
		/* make a subdesign that is the basicDesign rotated 180 degrees */
	}
	public static void makeDesign(int a, int b){
		/* Make a design where the floor mat is broken into subpatterns of height a
		 *	and width b, where the top left subpattern is the basicDesign, 
		 *	the one in the top right is a horizontally flipped design
		 *  the one in the bottom left is a vertically flipped design
		 *  and the one in the bottom right is a rotated design */
	}
	public static String toString(String[][] a){
		String aString = new String();
		for (int row = 0; row < a.length; row++) {
		    if (a[row] != null && a[row].length > 0) {
		        aString = aString + a[row][0];

		        for (int column = 1; column < a[row].length; column++) {
		            aString = aString + " " + a[row][column];
		        }
		    }
		    aString = aString + "\n";
		}
		return aString;
	}

}
