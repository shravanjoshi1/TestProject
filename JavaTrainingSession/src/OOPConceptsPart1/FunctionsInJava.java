package OOPConceptsPart1;

public class FunctionsInJava {
//Starting point of execution
	
	//Main method is void and never return a value
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava(); {
			
			//one object will be created and obj is the reference variable
			//after creating the object the copy of all non static methods will be given to this obj
			//You need to create objects always for calling non static methods
			
			obj.test();
			int i = obj.pqr();
			System.out.println(i);
			obj.divison(30, 5);
			
			 String S1 = obj.qa();
			 System.out.println(S1);
			 
			 int k = obj.divison(30, 10);
			 System.out.println(k);
			
		}
		
		
		
	}
		
		
		//Non static methods
		
	// Void--- does not return any value
		public void test() // No input and No output
		{
			System.out.println("Test method");
			
		}
		
		//pqr method and return type of this method is int
		
		public int pqr() //No input and some output
		{ 
			System.out.println("PQR Method");
			int a =10;
			int b= 20;
			int c = a+b;
			
			
			return c;
			
		}
		
		
		public String qa( ) //No input and some output
		{
			System.out.println("QA Method");
			String s = "Selenium";
			return s;
		}
		
		//x and y are input parameters or input arguments
		//return type is integer
		public int divison(int x , int y) {
			
			System.out.println("Divison method");
			
			int d = x/y;
			
			return d;
			
		}

	

}
