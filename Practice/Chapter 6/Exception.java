class Worker {
	public void start () throws java.lang.RuntimeException {
		System.out.println("Started");
		throw new RuntimeException("RuntimeException was threw.");
	}
}


public class Exception {
	public static void main (String ... args) {
		try {
			new Worker().start();	
		} finally {

		}

		
	}
}