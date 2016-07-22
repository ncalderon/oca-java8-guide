class Fish {
	protected int size;
	private int age;
	public int sameMember;
	public String str;
	public Fish(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}


}
public class Shark extends Fish {
	private int numberOfFins = 8;
	public int sameMember;
	public char c;

	public static void main (String ... args){
		Shark shark = new Shark(10);
		System.out.println(shark.getAge());
		//shark.displaySharkDetails();		
	}

	/*public int getAge() {
		return super.getAge()*5;
	}*/

	public Shark(int age) {
		super(age);
		sameMember = 5;
		this.size = 4;
	}
	public void displaySharkDetails() {
		System.out.println(super.getAge());
		System.out.println(this.getAge());
		System.out.println(str);
		System.out.println(c);
		System.out.println(sameMember);
		System.out.println(super.sameMember);
		/*System.out.print("Shark with age: "+getAge());
		System.out.print(" and "+size+" meters long");
		System.out.print(" with "+numberOfFins+" fins");*/
	}
}