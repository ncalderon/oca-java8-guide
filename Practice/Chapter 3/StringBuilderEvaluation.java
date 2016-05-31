public class StringBuilderEvaluation {
	public static void main (String args[]) {

		StringBuilder sb = new StringBuilder("animals");
		sb.insert(9, "-");
		System.out.println(sb);

		/*
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");
		StringBuilder same = sb.append("+end");

		System.out.println(same.toString());
		System.out.println(sb.toString());
		*/
		
	}



}