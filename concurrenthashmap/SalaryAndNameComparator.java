package com.kodewala.concurrenthashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalaryAndNameComparator implements Comparator<Employee3>
{
	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		
		if(o1.salary > o2.salary)
		{
			return 1;
		}
		else if(o1.salary < o2.salary)
		{
			return -1;
		}
		else {
			return o1.name.compareTo(o2.name);
		}
	}
    
	public static void main(String args[])
	{ 
		List<Employee3> employee = new ArrayList<>();
		employee.add(new Employee3("Monu",50000));
		employee.add(new Employee3("Amit",6000));
		employee.add(new Employee3("Rahul",70000));
		employee.add(new Employee3("Ankit",90000));
		
		
		System.out.println("Before Sorting:");
        for (Employee3 e : employee) {
            System.out.println(e);
        }

       
        Collections.sort(employee, new SalaryAndNameComparator());

        System.out.println("\nAfter Sorting by Salary then Name:");
        
        for (Employee3 e : employee) {
            System.out.println(e);
        }
        
	}
}
