import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CheckedExceptions {
	public static void main (String ... args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\testing.txt"));
			//throw new FileNotFoundException();
		} catch (IOException io) {
			throw io;
		} 
	}


}