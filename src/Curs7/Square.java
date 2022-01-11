package Curs7;

public class Square extends Shape{

	String shapeName = "Square";
	String shapeColor = "Black";
	
	public Square() {
		System.out.println("Square class constructor");
	}
	
	//contructor cu parametrii
	public Square(String color, String name) {
		super(color, name);
	}
	

	public void displayDetails() {
		System.out.println(" The shape name is :" + super.shapeName + " and the color is: " + shapeColor);

	}
	
	/**
	 *  Acces location        Public      Protected   Default   Private
	 *  
	 *  Same class             yes          yes         yes       yes  
	 *  
	 *  Subclass in same       yes          yes         yes       no  
	 *  package
	 *  
	 *  
	 *  Other classes in       yes          yes         yes       no   
	 *  same package
	 *  
	 *  Subclasses in other    yes          yes         no        no
	 *  packages
	 *  
	 *  
	 *  Non subclasses on      yes          no          no        no 
	 *  other packages
	 *  
	 * 
	 */
	
	
	
	
	

}
