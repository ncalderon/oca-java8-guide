public class IsWarmBlooded implements IIsWarmBlooded {
	@Override
	public boolean hasScales () {
		return false;
	}

	@Override
	public double getNonDefaultTemperature (double a) {
		return 10.2;
	}

	public static void main (String ... args) {
		new IsWarmBlooded().init();
	}

	public void init () {
		System.out.println(getTemperature());		
	}

}

interface IIsWarmBlooded {
	boolean hasScales();

	double getNonDefaultTemperature(double a);
	default double getTemperature () {
		return 10.0;
	}

	default double getTemperature (int a) {
		return 10.0;
	}
}