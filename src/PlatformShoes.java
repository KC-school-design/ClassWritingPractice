
public class PlatformShoes {

	private int size; 
	private String color;
	private int heelsz;
	
	
	public PlatformShoes() {

		size = 8;
		color = "black";
		heelsz = 2;
		
	}
	
	public PlatformShoes(String newcolor, int newsize, int heels) {
		this();
		color = newcolor; 
		size = newsize;
		heelsz = heels;				
	}
	
	public String orderShoes() {
		String result = "";
		
		result = "Platform shoes: " + "size: " + size + ", color: " + color + ", heel size: " + heelsz;  
		return result;
	}
	
	
	public int getShoeSize() {
		return size;
	}
	
	public void setColor(String newcolor) {
		color = newcolor;
	}


}	
	
	
	
	
	
	
