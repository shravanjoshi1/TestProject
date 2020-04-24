package OOPConceptsPart2;

public class BMW extends Car {
	//When same method is present is parent and child class with same name and same number of arguments is called method overriding
	public void start() { // overridden method
		System.out.println("BMW ---Start");
	}
	
	public void theftSaftey () {
		System.out.println("BMW ---TheftSaftey");
	}
	
	

}
