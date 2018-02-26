package orsg.com.javabrains.model;

public class Circle {
	private int id;
	private String name;
	private int radius;
	private int rad_diff;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRad_diff() {
		return rad_diff;
	}
	public void setRad_diff(int rad_diff) {
		this.rad_diff = rad_diff;
	}

	private String Price;
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public Circle() {
		
	}
	public int getId() {
		System.out.println("i m id");
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*public Circle(int circleId,String name,String price)
	{
		// construtor needed when i need to fetch books record 
		System.out.println("Control circle class");
		setId(circleId);
		System.out.println("mycircleid="+circleId);
		setName(name);
		System.out.println("mycirclename="+name);
		setPrice(price);
		System.out.println("mycircle price="+price);
	}*/

	
	public Circle(int circleId,String name,int radius,int rad_diff)
	{ 
		
		
		System.out.println("Control circle class");
		setId(circleId);
		System.out.println("mycircleid="+circleId);
		setName(name);
		System.out.println("mycirclename="+name);
		setRadius(radius);
		System.out.println("mycircle price="+radius);
		setRadius(rad_diff);
		System.out.println("mycircle price="+rad_diff);
	}
	
	public Circle(int circleId,String name)
	{ 
		
		
		System.out.println("Control circle class");
		setId(circleId);
		System.out.println("mycircleid="+circleId);
		setName(name);
		System.out.println("mycirclename="+name);
		
	}
}
