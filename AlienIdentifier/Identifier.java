

import java.awt.Color;

public class Identifier {
	
	public static int classifyPixel(Color A, Color P,  Color pixel){	
		//this function determines whether the pixel is closer in color to A or P
		double rA = A.getRed();
		double gA = A.getGreen();
		double bA = A.getBlue();
		double rP = P.getRed();
		double gP = P.getGreen();
		double bP = P.getBlue();
		double rpixel = pixel.getRed();
		double gpixel = pixel.getGreen();
		double bpixel = pixel.getBlue();
		
		double dist0 = Math.sqrt(( (Math.pow((rA - rpixel),2)) + (Math.pow((gA - gpixel),2)) + (Math.pow((bA - bpixel),2)) ));
		double dist1 = Math.sqrt(( (Math.pow((rP - rpixel),2)) + (Math.pow((gP - gpixel),2)) + (Math.pow((bP - bpixel),2)) ));
		
		int answer = 2;
		
		if(dist0 < dist1){
			answer = 0;
		}
		else if(dist1 < dist0){
			answer = 1;
		}
		
		return answer;
	}
	public static void main(String[] args) {

		Picture myPicture = new Picture("Image1.jpg");
		int height = myPicture.height();
		int width = myPicture.width();
		Color c;
		Color aliens = new Color(53,67,38);  //This is the color (RGB value) of aliens
		Color pluto = new Color(49,40,32); //This is the normal color of Pluto
		int result;
		double numberAliens = 0;
		double numberPluto = 0;
		
		
		//This loop scans through the image, pixel by pixel
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				//gets the color at the pixel
				c = myPicture.get(j,i);
				result = classifyPixel(aliens, pluto, c);
				
				if(result == 0){
					//if it was 0, the color was closer to aliens
					numberAliens++;
				}
				else if(result == 1){
					//if it was 1, color was closer to pluto
					numberPluto++;
				}
				
			//greying out our classified picture
		    myPicture.set(j, i, pluto);
			}
		}
		double tot = height * width;
		double percentAliens = (numberAliens/tot)*100;
		double percentPluto = (numberPluto/tot)*100;
		
		
		System.out.println("Percent Aliens: "+percentAliens);
		System.out.println("Percent Planet: "+percentPluto);
		
		//saving our newly classified picture!
		myPicture.save("classifiedPicture.jpg");
	}


}
