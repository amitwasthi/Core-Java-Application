package com.infotech;

import java.util.ArrayList;
import java.util.Iterator;

class Student implements Comparable<Student>{
	
	int roll_no;
	String student_name;
	String student_branch;
	int student_marks;
	
	Student(int roll,String name,String branch,int marks){
		this.roll_no=roll;
		this.student_name=name;
		this.student_branch=branch;
		this.student_marks =marks;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.roll_no -o.roll_no;
	}
	
	
}

public class CollectionObjectOperation {
	
	public static void main(String[] args) {
		
		Student std5 =new Student(5, "Bauaasdf", "BTechf",1013);
		Student std1 =new Student(1, "Bauaa", "BTech",101);
		Student std2 =new Student(2, "Reeta", "BTech",102);
		Student std3 =new Student(3, "Amit", "BTech",103);
		Student std4 =new Student(4, "Mumbai", "BTech",104);
		
		ArrayList<Student> arlist =new ArrayList<Student>();
		
		arlist.add(std1);
		arlist.add(std2);
		arlist.add(std3);
		arlist.add(std4);
		
		System.out.println(arlist.toString());
		
		Iterator itr =arlist.iterator();
		
		while(itr.hasNext()){
			Student st =(Student)itr.next();
			System.out.println(st.roll_no +"   " +st.student_name+"   "+ st.student_branch+"   "+st.student_marks);
		}
		
		
		
		
	}

}
