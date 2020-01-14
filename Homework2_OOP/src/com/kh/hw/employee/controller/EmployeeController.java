package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e = new Employee();
	
	public void add(int empNo, String name, char gender, String phone) {
		Employee e = new Employee(empNo,name,gender,phone);
	}

	public void add(int empNo, String name, char gender, String phone,String dept, int salary, double bonus) {
		Employee e = new Employee(empNo,name,gender,phone,dept,salary,bonus);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		e=null;
		return e;
	}
	
	public String inform() {
		return e.printEmployee();
		
	}
	
}
