package JavaBasics;

public class ifElseConcepts {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if (a>b) {
			System.out.println("a is greater than b:"+ a);
		}
		else {
			System.out.println("b is greater than a:"+ b);
		}
		
		//Comparison operation 
		//<> <= == 
		
		int c = 40;
		int d =40;
		if (c==d)
		{
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//Greater of 3 numbers
		
		int a1 = 100;
		int b1 =300;
		int c1 = 200;
		
		if (a1>b1&&a1>c1)
		{
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1){
			System.out.println("b1 is the greatest");
			
		}
		
		else {
			System.out.println("c1 is the greatest");
		}
		
		
		

	}

}
