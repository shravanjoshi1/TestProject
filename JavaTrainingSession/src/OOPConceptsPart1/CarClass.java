package OOPConceptsPart1;

public class CarClass {
	
	//Class variables
	
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		
	//new CarClass --- this is the object of the Car class	
		//obj1, obj2 , Obj3 -- Object reference variable
		//new keyword is used to create a new object.
		CarClass obj1 = new CarClass();
		CarClass obj2 = new CarClass();
		CarClass obj3 = new CarClass();
		
		obj1.mod = 2020;
		obj1.wheel =4;
		
		obj2.mod = 2019;
		obj2.wheel = 4;
		
		obj3.mod = 2018;
		obj3.wheel = 4;
		
		System.out.println("Before assigining the reference");
		System.out.println(obj1.mod);
		System.out.println(obj1.wheel);
		
		System.out.println("After shifting the reference");
		
		//Shifting of reference
		obj1 =obj2;
		obj2 =obj3;
		obj3 = obj1;
		
		obj1.mod = 10;
		System.out.println(obj1.mod);//10
		obj3.mod =20;
		System.out.println(obj1.mod);//20
		
	

	}

}
