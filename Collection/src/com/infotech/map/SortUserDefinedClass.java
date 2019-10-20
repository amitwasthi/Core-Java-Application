package com.infotech.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
	
	int id;
	String name;
	int age;
	
	Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	@Override
	public int compareTo(Student obj) {
		
		if(age == obj.age){
			return 0;
		}else if(age>obj.age){
			return 1;
		}else{
			return -1;
		}
		
	}	
}

public class SortUserDefinedClass {
	
	public static void main(String[] args) {
		
		Student st1 =new Student(1, "BAUAA", 24);
		Student st2 =new Student(2, "sdfsd", 25);
		Student st3 =new Student(3, "sdfd YADAV", 45);
		Student st4 =new Student(4, "dfsdf RAI", 27);
		
		ArrayList<Student> arlist =new ArrayList<>();
		
		arlist.add(st1);
		arlist.add(st2);
		arlist.add(st3);
		arlist.add(st4);
		
		Collections.sort(arlist);
		
		Iterator itr =arlist.iterator();
		while(itr.hasNext()){
			
			Student std = (Student)itr.next();
			
			System.out.println(std.id +"  " +std.name+ "   "+std.age);
		}
		
		
		
		
	}

}
