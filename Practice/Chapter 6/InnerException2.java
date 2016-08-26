import static java.lang.System.out;
import java.lang.Exception;
public class InnerException2 {
	public static void main (String ... args) {
		out.println(new InnerException2().exceptions());
	}

	public String exceptions () {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result +="done";
		}
		return result;
	}
}