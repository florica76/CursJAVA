package Curs7;

public class FinalVariableExample {
	public final int VALUE;
	public FinalVariableExample(int value) {
		VALUE = value;
	}
	public void demo() {
	//	VALUE = 150;
		System.out.println(VALUE);
	}
	public static void main(String[] args) {
		FinalVariableExample obj = new FinalVariableExample(500);
		obj.demo();
	}
}
