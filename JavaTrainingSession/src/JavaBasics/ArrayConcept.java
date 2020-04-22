package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array: To store similar data type in array variable
		//lowest bound/index =0
		//upper bound = n-1 (n is size of array)
		// one dim array
		//disadvantages of array
		//1 Size is fixed--- static array-- to overcome this problem we use collection(ArrayList, HashTable)--dynamic array
		//2 similar data types-- To overcome this problem, we use object array
		
		//1. int array
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		
		//print all the value of arrays
		
		for(int j =0; j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//Object Array (Object is a class)//Object array is used to store different data types values
		
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] =" 1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
	for(int k=0;k< ob.length;k++){	
	System.out.println(ob[k]);
	}

	}

}
