package latihaninharintance;
import java.io.*;
import java.util.*;
public class asosiasicontoh {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ruby");
        Employee emp2 = new Employee("Gatot");
        Set<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);

        Bank bank = new Bank("BNI");

        bank.setEmployees(employees);

        for (Employee emp : bank.getEmployees()){
            System.out.println(emp.getEmployeeName()
                                +"Dengan Nama\t:"+bank.getBankName());
        }
    }
    
}
