class InitializationOrderSimple {
	private String name ="Torchie";


	{ 
		System.out.println(name); 
	} 

	static { 
		System.out.println(5); 
	}
	private static int COUNT = 0;

	static { 
		System.out.println(COUNT);
	}
	static { 
		COUNT += 10; System.out.println(COUNT); 
	}
	public InitializationOrderSimple () {
		System.out.println("Constructor");
	}
}

public class CallInitializationOrderSimple {
	public static void main (String [] args){
		
		System.out.println("Main");
		InitializationOrderSimple  ios = new InitializationOrderSimple ();
		InitializationOrderSimple  ios2 = new InitializationOrderSimple ();
	}

}