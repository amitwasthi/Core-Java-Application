package com.infotech;

import java.util.ArrayList;

public class EventManager9 {
	
	public static void main(String[] args) {
		
		ArrayList arlistalltypevalue = new ArrayList<>();
		
		arlistalltypevalue.add(1);
		arlistalltypevalue.add(3);
		arlistalltypevalue.add("element");
		arlistalltypevalue.add("examination");
		
		for (Object object : arlistalltypevalue) {
			System.out.println(object);
		}
		
	}	
		

}
