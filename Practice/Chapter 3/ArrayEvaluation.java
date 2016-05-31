import java.util.*;

public class ArrayEvaluation {
	
	public static void main (String args[]) {
		/*String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder();
		objects[0] = new StringBuilder();*/

		int [] numbers = {2,4,6,8};
		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println(Arrays.binarySearch(numbers, 4));
		System.out.println(Arrays.binarySearch(numbers, 1));
		System.out.println(Arrays.binarySearch(numbers, 3));
		System.out.println(Arrays.binarySearch(numbers, 9));

		int [] numbers2 = {3,2,1};
		System.out.println(Arrays.binarySearch(numbers2, 2));
		System.out.println(Arrays.binarySearch(numbers2, 3));


		
	}



}