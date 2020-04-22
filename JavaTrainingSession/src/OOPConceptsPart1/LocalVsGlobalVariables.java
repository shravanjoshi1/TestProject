package OOPConceptsPart1;

public class LocalVsGlobalVariables {
	
	
	//Global variables or class variables
	String name = "Tom"; 
	int age = 25;
	

	public static void main(String[] args) {
		
		int i =10; //Local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables(); 
		System.out.println(obj.name);
		System.out.println(obj.age);
	
	}
	
	public void sum() {
		
		int i =15; // Local variable for sum method
		int j =20;
		int k = i+j;
		System.out.println(k);
		
		
	}

}
