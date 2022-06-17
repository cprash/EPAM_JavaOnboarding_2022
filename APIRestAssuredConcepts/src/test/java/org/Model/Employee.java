package org.Model;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee  {

    int empid;
    String empname;
    LocalDate doj;

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", doj=" + doj +
                '}';
    }

    public Employee(int empid, String empname, LocalDate doj) {
        this.empid = empid;
        this.empname = empname;
        this.doj = doj;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

}
