package OOPConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
	int i =	Integer.parseInt(x);
	System.out.println(i);
	System.out.println(i+20);
	
	//Integer,Double,Character,Boolean
	
	String x1 = "12.33";
	 double j = Double.parseDouble(x1);
	 System.out.println(x1);
	 
	//String to boolean
	 String k = "true";
	 boolean b = Boolean.parseBoolean(k);
	 System.out.println(k);
	 
	 //int to String converstion
	 
	 int j1 = 200;
	 System.out.println(j1+200);
	 
	 String s1 = String.valueOf(j1);
	 System.out.println(s1+200);
	 
	 

	}

}
