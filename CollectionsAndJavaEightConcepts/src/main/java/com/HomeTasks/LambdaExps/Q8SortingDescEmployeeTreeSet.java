package com.HomeTasks.LambdaExps;

import java.util.TreeSet;

public class Q8SortingDescEmployeeTreeSet {

        public static void main(String[] args) {
            TreeSet<Employee> arr = new TreeSet<>((e1,e2)->{
                if(e1.name.compareTo(e2.name)<0)
                    return +1;
                else if (e1.name.compareTo(e2.name)>0)
                    return -1;
                else return 0;

            });
            arr.add(new Employee(600,"Rahul"));
            arr.add(new Employee(200,"Jio"));
            arr.add(new Employee(300,"Manoj"));
            arr.add(new Employee(200,"Sri"));


            System.out.println("After desc Sort on name:"+arr);



        }


}
