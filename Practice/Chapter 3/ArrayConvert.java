import java.util.Arrays;
import java.util.List;

public class ArrayConvert {
	public static void main (String ... args) {
		String a [] = {"hack", "robin"};
		List<String> list = Arrays.asList(a);
		System.out.println(a.length);
		System.out.println(list.size());
		list.set(1, "newList");
		a[0] = "newArray";
		System.out.println("Value [0] array: " + a[0]);
		System.out.println("Value [0] list: " + list.get(0));

		System.out.println("Value [1] array: " + a[1]);
		System.out.println("Value [1] list: " + list.get(1));	

		list.remove(1);
		

	}



}