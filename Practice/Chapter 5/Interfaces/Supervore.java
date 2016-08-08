public interface Herbivore {
	public int eatPlants();
}
public interface Omnivore {
	public void eatPlants();
}
public interface Supervore extends Herbivore, Omnivore {} // DOES NOT COMPILE
public abstract class AbstractBear implements Herbivore, Omnivore {}