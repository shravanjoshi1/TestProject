package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
	//+ is concatenation operator	
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 13.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+y);
		System.out.println(x+y+c+d);
		System.out.println("the value of a is:" + a);
		
		//Print ln is used to give new line space, if you don't give ln then check the output
		System.out.print("Hello Selenium");
		System.out.print("Hello Testing");
		
	}

}
