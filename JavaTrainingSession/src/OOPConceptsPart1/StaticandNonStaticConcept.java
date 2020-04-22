package OOPConceptsPart1;

public class StaticandNonStaticConcept {

	
    
		String name = "Tom";//Non static global variable
		static int age = 25;// Static global variable
		 
		 public static void main(String[] args) {
			 
			 //how to call static method and variables
			 
		//1.direct calling
			 sum();
			 
			 //calling by class name
			 StaticandNonStaticConcept.sum();
			 
			 //Variable calling
			 
			 System.out.println(age);
			 
			 


	}
		 
		 public void sendMail() { //non static method
			 System.out.println("Send main method");
		 }
		 
		 public static void sum() { //static method
			 
			 System.out.println("Sum Method");
		 }

}
