import java.util.List;
import java.util.ArrayList;

public class WrapperClasses {
	public static void main (String ... args ) {
		int primitiveInt = Integer.valueOf("123");
		Integer primitiveInteger = Integer.parseInt("123");
		//int primitiveInt2 = Integer.parseInteger("123");

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.remove(1);
		System.out.println(list);

	}

}