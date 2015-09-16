import javax.swing.ImageIcon;

public class Animal{
	
	private String name;
	private String description;
	private ImageIcon picture;

	Animal(String nm, String desc, ImageIcon pic){
		name = nm;
		picture = pic;
		description = desc;
	}

	public String getName(){
		return name;
	} 

	public ImageIcon getPicture(){
		return picture;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String desc){
		description = desc;
	}

	public void setName(String nm){
		name = nm;
	}

	public void setImage(ImageIcon pic){
		picture = pic;
	}

}