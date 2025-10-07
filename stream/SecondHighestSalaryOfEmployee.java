package com.kodewala.api.stream;

import java.util.Arrays;
import java.util.List;

class  Employee{
	int id;
	String name;
	int salary;
	
	Employee(int _id,String _name,int _salary)
	{
		this.id = _id;
		this.name = _name;
		this.salary = _salary;
	}
	
	public int getSalary()
	{
		return salary;
	}
}

public class SecondHighestSalaryOfEmployee {

		public static void main(String[] args) {
			Employee e1 = new Employee(101,"abhijit",45000);
			Employee e2 = new Employee(102,"swarna",50000);
			Employee e3 = new Employee(103,"tusar",65000);
			Employee e4 = new Employee(104,"chinmay",58000);
			Employee e5 = new Employee(105,"sachin",75000);
			
			List<Employee> emp = Arrays.asList(e1,e2,e3,e4,e5);
			Employee empll = emp.stream().sorted((a,b) -> b.getSalary() - a.getSalary()).skip(1).findFirst().orElse(null);
			
			System.out.println(empll);
			
			emp.stream().sorted((a,b) -> b.getSalary() - a.getSalary()).skip(1).findFirst().ifPresent(System.out::println);		
		}
}
