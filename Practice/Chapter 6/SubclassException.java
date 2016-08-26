import static java.lang.System.out;

public class SubclassException {

	class CanNotHopException extends java.lang.Exception {}
	class Hopper {
		// First example 
		// public void hoop () {}
		// Second example
		//public void hoop () throws CanNotHopException {}

		// third example
		public void hoop () throws java.lang.Exception {}
	}

	class Bunny extends Hopper {
		// First example - Next line doesn't compile
		// public void hoop () throws CanNotHopException {}
		
		// Second example
		// public void hoop () {}
		// Third example
		public void hoop () throws CanNotHopException, RuntimeException {}
	}
	public static void main (String ... args){

	}
}