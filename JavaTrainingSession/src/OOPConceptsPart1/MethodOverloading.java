package OOPConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
	MethodOverloading obj = new MethodOverloading();
	obj.sum();
	obj.sum(10);
	obj.sum(10, 20);
		

	}
	
	//Method Overloading---> When the method name is same with different arguments or input parameters within the same class
	//Duplicate methods--i.e same method name with same number of arguments are not allowed with in the same class
	//Note--- Main method also can be overloaded*********
	
	public void sum()//Zero input parameter
	{
		System.out.println("Sum method is printing---Zero Param");
	}
	
	public void sum( int i)// 1 input param 
	{
		System.out.println("Sum method is printing--1 Param");
		
	}
	
	public void sum( int k, int l)// 2 input param 
	
	{
		System.out.println("Sum method is printing--2 Param");
		System.out.println(k+l);
		
	}
	
	

}
