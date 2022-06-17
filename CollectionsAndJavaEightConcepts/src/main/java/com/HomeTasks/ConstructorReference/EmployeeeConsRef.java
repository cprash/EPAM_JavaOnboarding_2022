package com.HomeTasks.ConstructorReference;

import com.HomeTasks.ConstructorReference.Employeee;



@FunctionalInterface
public interface EmployeeeConsRef {
    Employeee get(String name,String acct,float salary);
}
