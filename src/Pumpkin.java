
public class Pumpkin { // <--- class header

	// instance variables- properties/attributes 
	private int weight;
	private String name;
	private boolean carved; 

	// Constructor
	// default-constructor - no-parameter constructor
	/*
	 * syntax
	 * public NameOClass(){  <--- how its supposed to look
	 * 
	 * }
	 * 
	 */
	public Pumpkin() {
		// constructor should initialize instance variables
		// Assign them values aka assignment statements
		name = "pumpkin";
		weight = 12;
		carved = false;
		
		//concatenate the attributes in one big string
		System.out.println(name + ":" + weight + ":" + carved);
		
	}


}
