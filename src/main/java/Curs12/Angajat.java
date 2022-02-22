package Curs12;

public interface Angajat {
	
	
	String getName();
	void setName();
	
	String getEmail();
	
	default String departamanet() {
		return "ceva";
	};
}
