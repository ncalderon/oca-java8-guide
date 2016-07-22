class InsufficientDataException extends Exception {}
class Reptile {
	protected boolean hasLegs() throws InsufficientDataException {
		throw new InsufficientDataException();
	}
	protected double getWeight() throws Exception {
		return 2;
	}
}
public class Snake extends Reptile {
	protected boolean hasLegs() {
		return false;
	}
	protected double getWeight() throws InsufficientDataException{
		return 2;
	}
}