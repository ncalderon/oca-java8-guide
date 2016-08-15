class Reptile {
	public String getName () {
		return "Reptile";
	}
}

class Alligator extends Reptile {
	public String getName () {
		return "Alligator";
	}
}

class Crocodile extends Reptile {
	public String getName () {
		return "Crocodile";
	}
}

public class ZooWorker {

	public static void feed(Reptile reptile) {
		System.out.println("Feeding reptile " + reptile.getName());
	}

	public static void main (String ... args) {			
		feed(new Alligator());
		feed(new Crocodile());
		feed(new Reptile());		
	}
}

/*
Output

Feeding reptile Alligator
Feeding reptile Crocodile
Feeding reptile Reptile

*/