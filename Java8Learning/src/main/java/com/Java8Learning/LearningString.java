package com.Java8Learning;

public class LearningString {

	public static void main(String[] args) throws Exception {

ThreadExmaple te = new ThreadExmaple();
ThreadExmaple te2 = new ThreadExmaple();
te.start();
te2.start();
System.out.println(te.getName());
System.out.println(te2.getName());
	}
}

class ThreadExmaple extends Thread {
	public void run() {
		System.out.println("Thread1 is running");
	}
}

class ThreadExmaple2 extends Thread {
	public void display2() {
		System.out.println("Thread2 is running");
	}
}