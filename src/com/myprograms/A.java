package com.myprograms;

class A {
	
	int a;
	a=60;
	A(){
		a=20;
	}
	
	void B()
	{
		a=50;
		System.out.println(a);
	}
	 void c()
	 {

			System.out.println(a);
	 }
	
	public static void main(String[] args) {
	
		A x=new A();
		x.B();
		x.c();
		
		System.out.println(x.a);
			
	}

}
