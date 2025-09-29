package com.kodewala.inheritance.practice;

class Employee
{
	String name;
	double baseSalary;
	public Employee(String _name,double _baseSalary)
	{
		this.name = _name;
		this.baseSalary = _baseSalary;
	}
	
	public double calculateSalary()
	{
		return baseSalary;
	}
	
	public void display()
	{
		System.out.println(name+" Salary is :-> "+calculateSalary());
	}
	
}

class Manager extends Employee
{

	double bonus;
	Manager(String name,double baseSalary,double bonus)
	{
		super(name,baseSalary);
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary()
	{
		return bonus+baseSalary;
	}
	
}

class Developer extends Employee
{
	double bonus;
	double overTime;
	
	public Developer(String name,double baseSalary,double bonus,double overTime)
	{
		super(name,baseSalary);
		this.bonus = bonus;
		this.overTime = overTime;
		
	}
	@Override
	public double calculateSalary()
	{
		return (baseSalary+bonus+overTime);
	}
	
}

public class Driver 
{
  public static void main(String args[])
  {
	  Manager M1 = new Manager("Monu",100000,50000);
	  Developer D1 = new Developer("Nitish",70000,30000,10000);
	  
	  M1.display();
	  D1.display();
  }
}
