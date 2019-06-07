package com.Java8Learning;

public class Polyexam {

	public static void main(String[] args) {
		A a = new B();
		a.sum();
		
	}

}

class A{
	public void sum(){
		System.out.println("this is sum of A class");
	}
	public void sub(){
		System.out.println("this is sub of A class");
	}
}

class B extends A{
	public void sum(){
		System.out.println("this is sum of B class");
	}
	public void div(){
		System.out.println("this is div of B class");
	}
}