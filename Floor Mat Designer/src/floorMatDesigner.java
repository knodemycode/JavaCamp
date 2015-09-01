
public class floorMatDesigner {
	static String[][] basicDesign, reversedHorizontal, reversedVertical, totalDesign, rotated;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}

	private static void run() {
		// TODO Auto-generated method stub
		basicDesign = randomDesign(5,4);
		makeDesign(2,3);
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
		for(int i=0; i<reversedHorizontal.length;i++){
			for(int j=0; j<reversedHorizontal[0].length; j++){
				reversedHorizontal[i][j] = basicDesign[i][reversedHorizontal[0].length-j-1];
			}
		}
	}
	public void flipVertical(){
		for(int i=0; i<reversedVertical.length;i++){
			for(int j=0; j<reversedVertical[0].length; j++){
				reversedVertical[i][j] = basicDesign[reversedVertical[0].length-i-1][j];
			}
		}
	}
	public void rotate180(){
		for(int i=0; i<rotated.length;i++){
			for(int j=0; j<rotated[0].length; j++){
				rotated[i][j] = reversedHorizontal[rotated[0].length-i-1][j];
			}
		}
	}
	public static void makeDesign(int a, int b){
		totalDesign = new String[basicDesign.length*a][basicDesign[0].length*b];
		for(int i=0; i<a;i++){
			for(int j=0; j<b;j++){
				for(int k=i*basicDesign.length; k<(i+1)*basicDesign.length; k++){
					for(int l=j*basicDesign[0].length; l<(j+1)*basicDesign[0].length;l++){
						if(i%2==0 && j%2==0){
							totalDesign[k][l] = basicDesign[k%basicDesign.length][l%basicDesign[0].length];
						}
						else if(i%2==1 && j%2==0){
							totalDesign[k][l] = reversedVertical[k%basicDesign.length][l%basicDesign[0].length];
						}
						else if(i%2==0 && j%2==1){
							totalDesign[k][l] = reversedHorizontal[k%basicDesign.length][l%basicDesign[0].length];
						}
						else if(i%2==1 && j%2==1){
							totalDesign[k][l] = rotated[k%basicDesign.length][l%basicDesign[0].length];
						}
					}
				}
			}
		}
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
