public class Chick {
	private String name = "Fluffy";
	{ System.out.println("Setting field"); }
	public Chick () {
		name = "tiny";
		System.out.println("Setting constructor");
	}

	public  static void main (String[] args)  {
		Chick chick = new Chick();
		System.out.println(chick.name);	
	}
}