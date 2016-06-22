import java.util.*;

public class LambdaEvaluation {
	public static void main (String ... args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppyr");
		bunnies.add("hoppy");

		System.out.println(bunnies);
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies);

	}


}