package com.SortingAndComparator.CustomCLassSortingLambdaExpAndCOmparator;

import java.util.ArrayList;
import java.util.Collections;

import com.SortingAndComparator.CustomCLassSortingLambdaExpAndCOmparator.Employee;

public class SortingDescEmployee {

        public static void main(String[] args) {
            ArrayList<Employee> arr = new ArrayList<Employee>();
            arr.add(new Employee(600,"Rahul"));
            arr.add(new Employee(200,"Jio"));
            arr.add(new Employee(300,"Manoj"));
            arr.add(new Employee(200,"Sri"));

            System.out.println("Before Sort:"+arr);

            Collections.sort(arr,(e1,e2)->{
                if(e1.no<e2.no)
                    return +1;
                else if (e1.no>e2.no)
                    return -1;
                else return 0;
            });
            System.out.println("After desc Sort on no:"+arr);

            Collections.sort(arr,(e1,e2)->{
                if(e1.name.compareTo(e2.name)<0)
                    return +1;
                else if (e1.name.compareTo(e2.name)>0)
                    return -1;
                else return 0;
            });
            System.out.println("After desc Sort on name:"+arr);



        }


}
