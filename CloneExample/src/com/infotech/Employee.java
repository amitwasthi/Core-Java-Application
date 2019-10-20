package com.infotech;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private Department department;
	
	Employee(int id,String name,Department department){
		this.id =id;
		this.name =name;
		this.department =department;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
