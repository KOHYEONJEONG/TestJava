package com.java.test.service;

import Static.StaticTest;

public class TestService2 {
	public void test() throws Throwable{
		System.out.println("test메소드");
	}
	
	public void printS() {
		System.out.println(StaticTest.s);//TestController4에서 수정했기때문에 HELLO임.
	}
}
