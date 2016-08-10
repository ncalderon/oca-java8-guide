class Bird {
	public String getName () {
		return "Unknown";
	}

	public void displayInformation () {
		System.out.println("The bird name is: " +getName());
	}
}

public class Peacock extends Bird {

	@Override
	public String getName () {
		return "Peacock";
	}
	public static void main (String ... args) {
		Bird bird = new Peacock();
		bird.displayInformation();
	}

}

/*

Output:

The bird name is: Peacock

*/