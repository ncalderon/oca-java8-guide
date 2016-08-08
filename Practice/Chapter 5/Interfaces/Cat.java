public class Cat implements Run, Walk {

	public int getSpeed () {
		return 2;		
	}

	public static void main (String ... args) {
		System.out.println(new Cat().getSpeed());
	}
}

interface Walk {
	public default int getSpeed () {
		return 5;
	}

}

interface Run {
	public default int getSpeed () {
		return 10;		
	}
}