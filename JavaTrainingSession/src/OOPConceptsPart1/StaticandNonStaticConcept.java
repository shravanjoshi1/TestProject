package OOPConceptsPart1;

public class StaticandNonStaticConcept {

	//global variable will be available across all the functions with some conditions
    
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
			 System.out.println(StaticandNonStaticConcept.age);
			  
			 // Non static variables
			 StaticandNonStaticConcept obj = new StaticandNonStaticConcept();
               obj.sendMail();
               System.out.println(obj.name);
               
        //can i access static methods using object reference?? Yes can access
               obj.sum(); //Warning given, static method should be access in static way
	}
		 
		 public void sendMail() { //non static method
			 System.out.println("Send mail method");
		 }
		 
		 public static void sum() { //static method
			 
			 System.out.println("Sum Method");
		 }

}
