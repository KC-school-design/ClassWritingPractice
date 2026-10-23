
public class Runner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	PlatformShoes heels = new PlatformShoes();
	PlatformShoes initheels = new PlatformShoes("red", 9 , 4);
	PlatformShoes shoes = new PlatformShoes("silver", 9, 4);
	
	shoes.setColor("gold");
	System.out.println(heels.orderShoes());
	System.out.println(initheels.orderShoes());
	System.out.println(shoes.orderShoes());
	
	PunchBowl fruitpunch = new PunchBowl(30,"fruitpunch");
	System.out.println(fruitpunch.bowlstats());
	
	DiscoBall ball1 = new DiscoBall(20, 2, "gold");
	System.out.println(ball1.discoBall());
	ball1.setSpeed(-5);
	
	DanceTicket t1 = new DanceTicket("Alice", 20, false);
	System.out.println(t1.Ticket());
	t1.Scanned();
	System.out.println(t1.Ticket());

	}
}