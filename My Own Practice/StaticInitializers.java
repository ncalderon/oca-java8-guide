
public class StaticInitializers {

	static class ParentTest {
	static int parent = 1;
	static {
		System.out.println("ParentTest");
	}
}

static class test extends ParentTest {

	//static int parent = 0;
	static int child = 1;
	static {
		System.out.println("ChildTest");
	}

}



	public static String message = "";
	/*static {
		System.out.println(6 % 2);
		System.out.println((3 / 2) % 2);
		System.out.println(2>>3);
		message = "kakak" + 2 * 3 / 2  % 2 + true;
	}*/
	public static int n = 0;
	{
		/*n = false + true;*/
	}


	public static void main (String ... args){
		/*System.out.println("Printing message: "+ message);
		System.out.println("Printing integer: "+ n);*/

		System.out.println(test.parent);
	}


}