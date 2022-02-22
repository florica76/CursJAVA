package Curs14;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeeUtils<Developer> dev = new EmployeeUtils<Developer>(new Developer("Ionut", 2500));
        EmployeeUtils<Manager> manager = new EmployeeUtils<Manager>(new Manager("Oana", 3500));
        EmployeeUtils<Developer> dev2 = new EmployeeUtils<Developer>(new Developer("Maria", 2500));
        System.out.println("Este salariul la fel ? :" + dev.isSalaryEqual(dev2));

        System.out.println("Este salariul la fel ? :" + dev.isSalaryEqual(manager));
    }
    // POM - page object model
    // pagina aplicatie == clasa ==> locatori si metoda
    // homePage > HomePage.class
    //cartpage > CardPage.class

    //test script ==> user flow
    //homePage.clickProduct("Pepsi") ==> Homepage homePage = new HomePage();
    //cartPage.checkCart()
    //page.getInstance(Homepage.class).clickProduct
    //Page ( il definesti generics) extinzi restul de clase
}
