package com.lti.view;

import com.lti.model.Employee;

public class EmpView {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setName("Manthan");
		
		System.out.println("Employee Id: " + emp.getEmpId());
		System.out.println("Employee Name: " + emp.getName());
	}
}
