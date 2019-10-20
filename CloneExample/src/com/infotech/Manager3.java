package com.infotech;

public class Manager3 {
	public static void main(String[] args) {
		String str1 ="HELLO";
		String str2 ="HELLo";
		
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("same");
		}else{
			System.out.println("not same");
		}
		
		if(str1 ==str2){
			System.out.println("yes");
		}else{
			System.out.println("NO");
		}
		
	}

}
