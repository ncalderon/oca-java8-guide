interface InterfaceAbstract {
	abstract void abstractMethod();
}


public class TestingAbstract implements InterfaceAbstract {
	public static void main (String ... args) {
		TestingAbstract t = new TestingAbstract();
		t.abstractMethod();
	}

	public void abstractMethod() {
		System.out.println("Printed from abstract Method.");
	}
}