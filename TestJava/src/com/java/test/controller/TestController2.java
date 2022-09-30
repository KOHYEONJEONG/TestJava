package com.java.test.controller;

import com.java.test.bean.TestBean;

public class TestController2 {
	public static void main(String[] args) {
		
		TestBean tb = new TestBean();
		
		tb.setNo(1);
		tb.setId("Test");
		tb.setPw("1234");
		
		System.out.println(tb.getNo()+"\t"+tb.getId());
		
		
		
	}
}
