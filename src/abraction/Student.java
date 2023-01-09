package abraction;

public abstract class Student {

	int im = 10;
	static String st= "Preet";
	
	public static void main(String[] args) {
		System.out.println("DMDG");
	}
	
	public void maths() {
		System.out.println("maths");
	}
	
	public void maths2() {
		System.out.println("maths2");
	}
	public abstract void test();
	
	Student(){
		System.out.println("constructor");
	}
}
