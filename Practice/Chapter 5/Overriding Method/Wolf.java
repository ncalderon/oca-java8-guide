class Canine {
	public double getAverageWeight() {
		return 50;
	}

	public void printAverageWeight () {
		System.out.println(getAverageWeight());		
	}

	public void printAverageWeightThis () {
		System.out.println(this.getAverageWeight());		
	}
}
public class Wolf extends Canine {
	public double getAverageWeight() {
		return super.getAverageWeight()+20;
	}
	public static void main(String[] args) {
		new Wolf().printAverageWeight();
		new Wolf().printAverageWeightThis();
		/*System.out.println();*/

		/*System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());*/
	}
}