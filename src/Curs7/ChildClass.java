package Curs7;

public class ChildClass extends ParentClass{
	
	int number = 30;
	
	public void printNumber() {
		System.out.println( super.number);
	}
	

	public static void main(String[] args) {

		ChildClass obj =  new ChildClass();
		obj.printNumber();
		
		
	}

}
