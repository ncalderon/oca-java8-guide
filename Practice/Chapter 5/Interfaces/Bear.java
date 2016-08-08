/*// FIRST EXAMPLE

interface Herbivore {
	public int eatPlants(int quantity);
}
interface Omnivore {
	public void eatPlants();
}
public class Bear implements Herbivore, Omnivore {
	public int eatPlants(int quantity) {
		System.out.println("Eating plants: "+quantity);
		return quantity;
	}
	public void eatPlants() {
		System.out.println("Eating plants");
	}
}*/

// SECOND EXAMPLE

public interface Herbivore {
	public int eatPlants();
}
public interface Omnivore {
	public void eatPlants();
}
public class Bear implements Herbivore, Omnivore {
	public int eatPlants() { // DOES NOT COMPILE
		System.out.println("Eating plants: 10");
		return 10;
	}
	public void eatPlants() { // DOES NOT COMPILE
		System.out.println("Eating plants");
	}
}
