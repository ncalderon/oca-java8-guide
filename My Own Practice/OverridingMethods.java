class Parent {
	public void makeSomething () throws Exception {
		System.out.println("Making something from parent");
	}	
}

class Child extends Parent {
	@Override
	public void makeSomething () throws RuntimeException {
		System.out.println("Making something from child");
	}
}


public class OverridingMethods {
	public static void main (String ... args) {
		Child child = new Child();
		Parent parent = new Parent();
		child.makeSomething();
		parent.makeSomething();
	}
}