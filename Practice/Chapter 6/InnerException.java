
import static java.lang.System.out;
import java.lang.Exception;
public class InnerException {


	public static void main (String ... args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			out.println("First catch was reached");
			//try {
				throw new RuntimeException();
			/*} catch (Exception inner) {
				out.println("Second catch was reached");
			}*/
		} finally {
			throw new RuntimeException();
		}
	}
}