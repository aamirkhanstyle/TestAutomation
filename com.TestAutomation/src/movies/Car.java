 package movies;

public class Car {
	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
		c.transmission();
		Bollywood b=new Bollywood();
		b.loginWithUserName();
	}
	public void drive() {
		System.out.println("driver");
		
	}
	public void transmission() {
		System.out.println("Automation");
	}
}
