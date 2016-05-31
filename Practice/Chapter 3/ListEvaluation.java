import java.util.*;

class ListEvaluation {
	public static void main (String ... args) {
		List<String> list = new ArrayList<>();
		list.add("baskin");
		list.add("robin");
		System.out.println(list.size());
		String[] stringArr = list.toArray(new String[0]);
		System.out.println(stringArr.length);
		

	}


}