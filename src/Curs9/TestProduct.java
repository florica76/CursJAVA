package Curs9;

public class TestProduct {

	public static void main(String[] args) {

		//Product produs = new Product();
		MobilePhone mobilePhone =  new MobilePhone(300, 3);
		System.out.println(mobilePhone.caluclatePrice());
		mobilePhone.printProductRating();
		
		Laptop laptop = new Laptop(100, 10, 5);
		System.out.println(laptop.caluclatePrice());
		laptop.printProductRating();
	}

}
