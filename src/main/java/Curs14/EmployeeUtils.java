package Curs14;

public class EmployeeUtils<T extends Employee> {
    T employee;
    public EmployeeUtils(T employee){
        this.employee = employee;
    }
    public int getSalary(){
        return employee.getSalary();
    }
    public boolean isSalaryEqual(EmployeeUtils<?> otherEmployee){
        if ( employee.getSalary()==otherEmployee.getSalary()){
            return true;
        }
        return false;
    }
}
