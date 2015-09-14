public class Animal{
	
	private String name;
	private ImageIcon picture;

	Animal(String nm, ImageIcon pic){
		name = nm;
		picture = pic;
	}

	public String getName(){
		return name;
	} 

	public ImageIcon getPicture(){
		return picture;
	}

	public setName(String nm){
		name = nm;
	}

	public setImage(ImageIcon pic){
		picture = pic;
	}

}