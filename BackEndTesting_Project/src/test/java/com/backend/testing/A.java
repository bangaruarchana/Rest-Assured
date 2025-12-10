package com.backend.testing;

public class A {

//	public void a() {
//		System.out.println("execute a method");
//	}
//	
//	public void b() {
//		System.out.println("execute b method");
//	}
//	
//	public void c() {
//		System.out.println("execute c  method");
//	}
	
	public static A a() {
		System.out.println("executing a method");
		return new A();
	}
	
	public A b() {
		System.out.println("executing b method");
		return new A();
	}
	
	public B c() {
		System.out.println("executing c method");
		return new B();
	}
}
