package com.infotech;

import java.util.HashSet;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	
	Book(int id,String name,String author,String publisher,int quantity){
		this.id =id;
		this.name =name;
		this.author =author;
		this.publisher =publisher;
		this.quantity =quantity;
	}
	
}

public class HashSetOperation2 {
	
	public static void main(String[] args) {
		
		Book b1 =new Book(1, "Baua", "Baua", "Baua",100);
		Book b2 =new Book(1, "Baua", "Baua", "Baua",100);
		Book b3 =new Book(1, "Baua", "Baua", "Baua",100);
		Book b4 =new Book(1, "Baua", "Baua", "Baua",100);
		Book b5 =new Book(1, "Baua", "Baua", "Baua",100);
		Book b6 =new Book(1, "Baua", "Baua", "Baua",100);
		Book b7 =new Book(1, "Baua", "Baua", "Baua",100);
		Book b8 =new Book(1, "Baua", "Baua", "Baua",100);
		Book b9 =new Book(1, "", "", "",0);
		Book b10 =new Book(1, "", "", "",0);
		Book b11 =new Book(1, "sdf", "sfdsd", "sdf",0);
		
		HashSet<Book> book =new HashSet<>();
		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		book.add(b5);
		book.add(b6);
		book.add(b8);
		book.add(b9);
		book.add(b10);
		book.add(b11);
		
		for (Book book2 : book) {
			System.out.println(book2.id + "   "+book2.name+"  "+book2.author+"  "+book2.publisher+"   "+book2.quantity);
		}
		
	}

}
