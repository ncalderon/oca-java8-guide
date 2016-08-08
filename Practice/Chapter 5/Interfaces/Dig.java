public interface CanSwim {
	int MAXIMUM_DEPTH = 100;
	final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}
public interface CanSwim {
	public static final int MAXIMUM_DEPTH = 100;
	public static final boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}

// SECOND EXAMPLE

public interface CanDig {
	private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE
	protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE
	public static String TYPE; // DOES NOT COMPILE
}