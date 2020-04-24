package OOPConceptsPart1;

public class CallbyValueAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallbyValueAndCallByReference obj = new CallbyValueAndCallByReference();
		int x = 10;
		int y = 20;
		obj.testSum(x, y);//Call by value or Pass by Value
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		//After swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		

	}
	
	public int testSum(int a , int b)
	
	{
		a =30;
		b = 40;
		int c = a+b;
		return c;
	}
	//Call by reference
	public void swap(CallbyValueAndCallByReference t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q= temp;
		
	}
	
	

}
