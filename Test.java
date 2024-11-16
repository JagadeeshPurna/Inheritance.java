package Home_Work;

public class Test {

	public static void main(String[] args) {
		Room room = new Room();
		Tv tv = new Tv();
		room.setTv(tv);
		
		tv.setCompany("Samsung");
		tv.setCost(30000);
		tv.setMadein("South Korea");
		tv.setModel("Latest");
		tv.setType("LED");
		System.out.println("tv type: "+room.getTv().getType());
		System.out.println(tv.getCompany());
		System.out.println(tv.getCost());
		System.out.println(tv.getMadein());
		
		
		
		Chairs chairs = new Chairs();
		room.setChairs(chairs);
		chairs.setColor("Blue");
	    chairs.setCompany("Tata");
	    chairs.setModel("study chair");
	    System.out.println(room.getChairs().getColor());
	    System.out.println(chairs.getCompany());
	
		
		Fan fan = new Fan();
		room.setFan(fan);
		fan.setBlades(3);
		//room.setFan(fan);
		fan.setColor("white");
		fan.setModel("Recent");
		fan.setType("metal");
		System.out.println(fan.getColor());
		System.out.println(fan.getModel());
		System.out.println(fan.getType());
		System.out.println(room.getFan().getBlades());
		
	}

}
