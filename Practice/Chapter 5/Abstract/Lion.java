abstract class Animal {
	public abstract String getName();
}

abstract class BigCat extends Animal {
	public String getName() {


		return "BigCat";
	}
	public abstract void roar();
}
public class Lion extends BigCat {

	public static void main (String ... args) {
		Lion lion = new Lion();
		lion.roar();

	}

	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}