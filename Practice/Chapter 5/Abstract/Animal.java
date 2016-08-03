public class Animal extends DogAbstract {
	public static void main (String ... args) {
		Animal animal = new Animal();
		animal.method();
	}

	public void method() {
		System.out.println("Printed from method of Animal class.");

	}
}

abstract class AnimalAbstract {
	abstract void method();
}

abstract class DogAbstract extends AnimalAbstract {
	abstract protected void method();
}