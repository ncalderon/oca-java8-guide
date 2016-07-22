class Camel {
	protected Object getNumberOfHumps() {
		return "Undefined";
	}
}
public class BactrianCamel extends Camel {
	//private int getNumberOfHumps() { // DOES NOT COMPILE
	public String getNumberOfHumps() { // FIXING ISSUE
		return null;
	}

	public static void main(String ... args) {
		System.out.println("Main");		
	}
}