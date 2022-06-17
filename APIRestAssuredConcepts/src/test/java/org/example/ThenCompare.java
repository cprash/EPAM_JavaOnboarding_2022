package org.example;

import org.Model.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThenCompare {
    public static void main(String[] args) {
        List<Employee> listEmp= new ArrayList<>();
        listEmp.add(new Employee(1,"Rahul", LocalDate.of(2020,1,31)));
        listEmp.add(new Employee(2,"Kul1", LocalDate.of(2020,1,31)));
        listEmp.add(new Employee(3,"Kul", LocalDate.of(2021,1,31)));
        listEmp.add(new Employee(4,"Rahul", LocalDate.of(2021,1,31)));
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getDoj).thenComparing(Employee::getEmpname);

        Collections.sort(listEmp,employeeComparator);

        System.out.println(listEmp);

    }
}
