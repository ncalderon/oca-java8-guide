
import static java.lang.System.out;
public class PrintException {
	public static void main (String ... args){
		try {
			hop();
		} catch (java.lang.Exception e) {
			out.println(e);
			out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void hop () {
		throw new RuntimeException("cannot hop");
	}
}