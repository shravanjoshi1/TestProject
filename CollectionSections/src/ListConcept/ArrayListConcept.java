package ListConcept;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
	int a[] = new int [3]; // Static Array--Size is fixed
	
	//dynamix array -- Array List
	//1.Can contain duplicate values/elements
	//2. Maintains insertion order
	
	ArrayList ar = new ArrayList();
	
	ar.add(10);
	ar.add(20);
	ar.add(30);
	
	
	System.out.println(ar.size());
	
	ar.add(40);
	ar.add(50);
	ar.add("Test");
	ar.add(12.33);
	ar.add('a');
	ar.add(true);
	System.out.println(ar.size());// size of array list
	
	System.out.println(ar.get(4));// to get the value from an index
	
	//to print all the values from arraylist for loop
	
	//1. for loop to retrieve all values
	
	for (int i = 0 ; i< ar.size();i++)
	{
	System.out.println(ar.get(i));
	}

	
	//non generic vs generic
	
	//By adding the below line specific data types will be only be allowed
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();//Generic
	ar1.add(10);
	
	//Employee class object
	
	Employee e1 = new Employee("Shravan1",34,"QA");
	Employee e2 = new Employee("Shravan2",35,"QA1");
	Employee e3 = new Employee ("Shravan3",36 , "QA2");

	//Create Array List
	
	ArrayList<Employee> ar4 = new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	//iterator to traverse the value
	
	java.util.Iterator<Employee> it = ar4.iterator();
	while(it.hasNext()){
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
	

	
	
	
	}

}
