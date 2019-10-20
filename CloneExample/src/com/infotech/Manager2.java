package com.infotech;

public class Manager2 {
	
	int i =90;
	Manager2(int i){
		i=i;
		System.out.println(i);
	}
	
	public void show(){
		System.out.println("  sdf "+i);
		Manager2 m2 =new Manager2(10);
	}
	
	public static void main(String[] args) {
		Manager2 mm =new Manager2(50);
		System.out.println(mm.i);
		mm.show();
	}
}


