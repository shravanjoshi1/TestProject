package OOPConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static polymorphism or compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.Engine();
		
		
		System.out.println("***************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.Engine();
		
		System.out.println("***************");
		
		//Top casting
		
		Car c1 = new BMW(); // Child class object can be referred by parent class reference variable---dyamic polymorphism or run time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		c1.Engine();
		
		//Down casting
		
		 BMW b1 = (BMW)new Car(); //Class Cast Exception
		

	}

}
