class Bunny {
	public static void main (String ... args) {
		Bunny bunny = new Bunny();
		bunny.init();
	}

	private final String str;

	public Bunny () {
		this("");

		System.out.println("Constructor class");

		new Bunny("");
		return;
	}

	public Bunny (String a) {
		str = "";
		System.out.println("Constructor child class");
		return;
	}

	public void init () {

	}


}