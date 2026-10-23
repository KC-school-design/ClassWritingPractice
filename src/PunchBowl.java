
public class PunchBowl {
	private int cups;
	private int holds;
	private String flavor;

	public PunchBowl() {
		cups = 0; 
		flavor = "none";
		holds = 40;
	}
		
	public PunchBowl(int currentcups, String theflavor) {
		flavor = theflavor;
		cups = currentcups;
		holds = 40;

		if (cups > holds) {
			cups = holds;
		}
		else {
			cups = currentcups;
		}
	}
		
	public String bowlstats() {
		String result = "";
		
		result = "Bowlstats: " + "cupsleft: " + cups + ", MaxHold: " + holds + ", Flavor: " + flavor;  
		return result;
	}
	
	public void newFlavor(String newflavor) {
		flavor = newflavor;
	}	
	public int getCups() {
		return cups;
	}
	
	
}