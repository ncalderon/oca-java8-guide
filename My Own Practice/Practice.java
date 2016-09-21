enum NumbersEnum {
	ZERO,
	ONE,
	TWO,
	THREE;
}

public class Practice {
	
	public static void main (String ... args){
		System.out.println(NumbersEnum.ONE.ordinal() == 1L);
		int i = 0;
		long j = 0;
		System.out.println(i == j);
	}
}