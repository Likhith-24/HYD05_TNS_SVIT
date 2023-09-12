package com.svit.oops;

public class StaticDemo {
	int a;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo x= new StaticDemo();
		
		x.a=10;
		x.b=10;
		System.out.println("a= "+x.a+"\tb with reference to object "+b);
		StaticDemo.b=20;
		System.out.println("a= "+x.a+"\tb with reference to class "+b);
		b=30;
		System.out.println("a= "+x.a+"\tb without reference "+b);
		
	}

}