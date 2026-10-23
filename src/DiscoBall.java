
public class DiscoBall {

	private int size;
	private int rpm;
	private String color;
	
	
	
	
	public DiscoBall () {
		size = 12;
		rpm = 0;
		color = "silver";
	}
	
	public DiscoBall(int initsize, int initrpm, String initcolor) {
		size = initsize;
		rpm = initrpm;
		color = initcolor;
		if (rpm < 0) {
			rpm = 0;
		}
		
	}
	
	
	public String discoBall() {
		String result = "";
		
		result = "DiscoBall: " + "ballsize: "+ size + ", speed: " + rpm+ ", color: " + color;  
		return result;
	}
	
	
	
	public void setSpeed(int newrpm) {
		if (newrpm < 0) {
			rpm = 0;
		}
			else {
			rpm = newrpm;
				}
		}
	
	public int getSpeed(){
		return rpm;
	}
	
	
	
	
}
