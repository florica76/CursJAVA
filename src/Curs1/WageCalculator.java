package Curs1;

public class WageCalculator {
	int nrOreLucrate =40;
		
	public static void main (String[] args) {
		
		Tester tester1 = new Tester();
		tester1.setNume("Oana");
		tester1.setRatePerHour(40);
		tester1.setAge(25);

		System.out.println(tester1.getNume());


		Tester tester2 = new Tester();
		tester2.setNume("Maria");
		tester2.setRatePerHour(25);
		tester2.setAge(40);

		System.out.println(tester2.getNume());
		
		WageCalculator calc = new WageCalculator();
		
		System.out.println("Salariul lui " + tester1.getNume() + " este: " + calc.calculateSalary(tester1.getRatePerHour()));
		System.out.println(tester1.getNume() + " are " + tester1.getAge() + " ani.");
		System.out.println("Salariul lui " + tester2.getNume() + " este: " + calc.calculateSalary(tester2.getRatePerHour()));
		System.out.println(tester2.getNume() + " are " + tester2.getAge() + " ani.");
	}
	
	public int calculateSalary(int rateHurly) {
		int salary = nrOreLucrate * rateHurly;
		return salary;
		
	}
}
// tema : 