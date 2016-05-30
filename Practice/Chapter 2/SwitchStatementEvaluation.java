public class SwitchStatementEvaluation {
	public static void main (String args[]) {

		String n = "prueba";
		final String case_one = args[0];
		switch(n) {
			default:
				System.out.println("Case default");				
	
			case case_one :
				System.out.println("Case one");
			break;
			

		}	
	
	}

}