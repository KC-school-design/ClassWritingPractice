
public class Ghost {
	
	//instance variables - attributes
	
	private String name;
	private int spookylevel;
	private String location;
	private int seeThrough;
	
	
	
	public Ghost() {
		name = "Casper";
		location = "Attic";
		seeThrough = 5;
		spookylevel = 5;
		
		
	}
	public Ghost(String initializeName) {
		
		this(); //calls default constructor
		
		// now handles assignments specific to this constructor
		name = initializeName;
		}
	
	public Ghost(String alternateName, String newlocation) {
		
		//all default constructor so that all variables are assigned
		this(); //calls default constructor
		
		name = alternateName;
		location = newlocation;
	}
	
	
	
	/*
	 * Allow printing of Ghost object in terminal by 
	 * including a toString method. 
	 * 
	 * YOU (the student) defines the human-readable output. 
	 */
	
	public String toString() {
		String result = "";
		
		// build a string, the result, containing the properties
		// of  a Ghost object.
		result = name + ":" + location +":" + spookylevel + ":" + seeThrough;

		// return the String you built that will represent the stats of the object.
		return result;
	}
	
	
	
	// behavior of objects are method in the class
	public void haunt() {
		System.out.println("BOO!");
	}
	
	
	
	
}
