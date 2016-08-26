



import static java.lang.System.*;
public class VariousExceptions {	

	class AnimalsOutForAWalk extends RuntimeException { }
	class ExhibitClosed extends RuntimeException { }
	class ExhibitClosedForLunch extends ExhibitClosed { }

	public static void main (String ... args) {
		new VariousExceptions().visitPorcupine();
	}

	public void visitPorcupine() {
		try {
			seeAnimal();


		
		/*} catch (ExhibitClosed e) {// second catch block
			out.println("not today");*/
		} catch (ExhibitClosedForLunch e) {// first catch block
			out.println("try back later");
		}
		
	}

	public void seeAnimal () throws  ExhibitClosed, RuntimeException {
		out.println("seeAnimal was reached");
		throw new ExhibitClosed();
		//throw new java.lang.Exception();
	}
}