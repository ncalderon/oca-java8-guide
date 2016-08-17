

public class Interface {

	static interface i {
		static void test () {
			System.out.println("From interface i");
		}
	}

	static interface i2 extends i {
		/*static void test () {
			System.out.println("From interface i2");
		}*/
	}

	public static void main (String ... args) {
		i2.test();
	}
}