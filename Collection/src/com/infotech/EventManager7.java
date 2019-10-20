package com.infotech;

import java.util.Iterator;
import java.util.Stack;

public class EventManager7 {
	public static void main(String[] args) {
		
		Stack<String> stk =new Stack<>();
		
		/*stk.push("ONe");
		stk.add("FELEMENT");
		stk.add("5");
		stk.add("545");
		stk.add("Evaluation");*/
		
		System.out.println(stk);
		
		Iterator itr = stk.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
