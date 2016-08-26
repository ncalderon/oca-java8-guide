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
			System.out.println("Finally reached");
		}	
		System.out.println("Line 16 was reached");
	}
}


/*
Output:

Started
Finally reached
Exception in thread "main" java.lang.RuntimeException: RuntimeException was threw.
        at Worker.start(Exception.java:4)
        at Exception.main(Exception.java:12)
 */