
public class Platform_shoes {

	private int size; 
	private String color;
	private int heelsz;
	
	
	public Platform_shoes() {

		size = 9;
		color = "black";
		heelsz = 2;
		
		
	}
	
	public Platform_shoes(String newcolor, int newsize, int heels) {
		this();
		color = newcolor; 
		size = newsize;
		heelsz = heels;		
		
		
	}
	
	public String order_shoes() {
		String result = "";
		
		result = "Platform shoes order: " + size + ": " + color + ": " + heelsz;  
				
				
		return result;
	}
	
	
	public void shoesize() {
		if (size > 8) {
			size = 8;
		}
	}	
	
	
	
	
	
	
}
