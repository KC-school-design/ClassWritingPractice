
public class DanceTicket {

	private String name;
	private boolean scanned;
	private int price;
	
	public DanceTicket () {
		name = "GUEST";
		price = 20;
		scanned = false;
	}
	
	public DanceTicket (String initName, int initPrice, boolean initScanned) {
		name = initName;
		price = initPrice;
		scanned = initScanned;
	}
	
	public String Ticket() {
		String result = "";
		
		result = "TicketInfo: name: " + name + ", price: " + "$" + price + ", Scanned: " + scanned;  
		return result;
	}
	
	public void Scanned() {
		scanned = true;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	
	
}
