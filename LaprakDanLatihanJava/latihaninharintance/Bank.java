package latihaninharintance;
import java.io.*;
import java.util.*;
public class Bank {

    //atribut dari kelas bank
    private String bankName;
    private Set<Employee> employees;

    public Bank (String bankName){
        this.bankName = bankName;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setEmployees(Set<Employee>employees){
        this.employees= employees;
    }

    public Set <Employee> getEmployees(){
        return this.employees;
    }


    
}
