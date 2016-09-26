public class TestingQuestions {
	public static void main (String ... args) {

	}
}


// Test Cases Facts
/*

1. Local variables must be initialized before be used.

2. Overrided method cannot be more restrictive. For example:

	interface Hastail { int getTailLength()}
	abstract class Puma implements Hastail {
		protected int getTailLength() { return 4; }
	}

3. Parent constructor which throw an exception subclass must be declare their constructor and throws a covariant exception.

4. Printstacktrace
	
	static void sum(int a,int b){System.out.println("int method invoked");}
    static void sum(long a,long b){System.out.println("long method invoked");}
    
    public static void main( String[] args )
    {
        sum(1,1);
        sum(1l, 1l);
        Child c = new Child();

        try {
            c.checkedException();
        } catch (Exception e) {
            System.out.println();
            System.out.println(e.getClass());
            System.out.println(e.getClass().getSimpleName());
            e.printStackTrace();
        }
    }

    Output:

    int method invoked
	long method invoked
	java.io.IOException
		at com.java.courses.oca.inheritance.children.Child.checkedException(Child.java:43)
		at com.java.courses.oca.App.main(App.java:31)
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		at java.lang.reflect.Method.invoke(Method.java:498)
		at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

	class java.io.IOException
	IOException

5. Tricky switch

	int count = 0;
    int x = 3;
    while (count++ < 3){
        int y = (1 + 2 * count) % 3;
        out.println(y);
        switch (y){
            default:
                out.println("reached default");
            case 0: x -= 1; out.println("reached 0"); break;
            case 1: x+= 5; out.println("reached 5");
        }
        out.println(x);
    }
    out.println(x);

    Output:

    Loop: 1, Y: 0
	reached 0
	2
	Loop: 2, Y: 2
	reached default
	reached 0
	1
	Loop: 3, Y: 1
	reached 5
	6

6. Arrays

	List<Integer> l = new ArrayList<>(5);
    int [] i = new int[3];
    int [] b [] = new int[3][];
    int d = 5, e [][];
    e = new int[4][];
    out.println(d); // You can define a int and int [] in the same line.
    out.println(e); // Print the position in stack with the prefix of type. Ex: [[I@1b6d3586
    out.println(Arrays.toString(e)); // Way to convert to String for arrays
    out.println(l); // List has its own way to convert a String

    Output:

    5
	[[I@1b6d3586
	[null, null, null, null]
	[]

7. When a method is declared private it cannot be override, it can be hidden... 
   So if you use this method from the same class it would use the type method.

8. Exceptions

   Only checked exceptions are required to be handled (caught) or declared. Runtime exceptions 
   are commonly thrown by both the JVM and programmer code. Checked exceptions are usually thrown by programmer code. 
   Errors are intended to be thrown by the JVM. While a programmer could throw one, this would be a horrible practice.

*/