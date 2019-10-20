package com.infotech;

import java.util.HashSet;

public class HashSetOperation3 {
	public static void main(String[] args) {
		HashSet sh =new HashSet<>();
		
		sh.add(1);
		sh.add(2);
		sh.add(3);
		sh.add(1);
		sh.add(2);
		sh.add(3);
		sh.add("");
		sh.add("");
		sh.add("");
		
		System.out.println(sh);
	}

}
