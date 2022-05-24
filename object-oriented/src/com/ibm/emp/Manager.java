package com.ibm.emp;

public class Manager extends Employee {
	private double commission;
	public Manager() {
	}
	
	public Manager(String empName, double salary,double commission) {
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.commission=commission;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+commission;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Commnission: "+commission);
	}
	
	
	



}
