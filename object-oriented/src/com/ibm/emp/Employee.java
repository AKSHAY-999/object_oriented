package com.ibm.emp;

public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;
	private static int counter=101;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, double salary) {
		super();
		this.empNo = counter++;
		this.empName = empName;
		this.salary = salary;
	}
	public double getSalary(double salary) {
		return salary;
	}
	public void payslip() {
		System.out.println("Emp No: "+empNo);
		System.out.println("Emp name: "+empName);
		System.out.println("Salary: "+salary);
		
	}
	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
