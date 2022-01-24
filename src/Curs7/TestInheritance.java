package Curs7;

public class TestInheritance {
	
	
	public static void main(String[] args) {
		TesterAutomat tester =  new TesterAutomat();
		tester.setLimbajProgramare("Java"); // clasa TesterAutomat
		tester.setDepartamanet("Quality Assurance"); //clasa Tester
		tester.setSeniority("Junior"); // clasa Tester
		tester.setEmail("matei@matei.com");// clasa Angajat
		tester.setName("Matei");//clasa Angajat
		System.out.println("Numele angajatului este " + tester.getName() + " face parte din depatamentul " +tester.getDepartament() 
			+ " este de nivel " + tester.getSeniority() + " si foloseste " + tester.getLimbajProgramare() + " pentru a scrie teste!");
	}
}
