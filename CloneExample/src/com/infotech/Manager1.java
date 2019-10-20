package com.infotech;

public class Manager1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department department =new Department(1, "Human Resource");
		Employee original =new Employee(1, "Admin", department);
		
		//Lets create a clone of original object
		Employee cloneobject =(Employee)original.clone();
		
		System.out.println(cloneobject.getId());
		System.out.println(original.getId());
		System.out.println(" -------------------- ");
		System.out.println(cloneobject.getName());
		System.out.println(original.getName());
		System.out.println(" -------------------- ");
		System.out.println(cloneobject.getDepartment());
		System.out.println(original.getDepartment());
		System.out.println(" -------------------- ");
		System.out.println(cloneobject.getClass());
		System.out.println(original.getClass());
		
		//args.cloneobject.getDepartment().setName("Marketing");
		//original.getDepartment().setName("Finance");
		
		System.out.println();
		
		
	}

}
