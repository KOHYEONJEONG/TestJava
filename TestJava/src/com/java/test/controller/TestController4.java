package com.java.test.controller;

import java.util.Calendar;

import com.java.test.service.TestService2;

import Final.FinalTest;
import Static.StaticTest;
import designPattern.Test﻿Singleton;

public class TestController4 {
	public static void main(String[] args) {
		//static활용 시 : 클래스명.변수명 or 클래스명.메소드명
		System.out.println(StaticTest.s);
		
		StaticTest.s = "HELLO";//이후 해당 변수 사용 시 HELLO로 적용. 다른 클래스에서도 동일하게 적용.
		System.out.println(StaticTest.s);
		
		//공유 자원이기 때문에 누구나 사용가능하다.
		//접근권한이 public인 경우 누구나~
		TestService2 ts2 = new TestService2();
		ts2.printS();//HELLO
		
		FinalTest ft = new FinalTest();
		//ft.msg = "hi";//고정형 변수, final이 지정되면 값의 변경 불가하다.
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(1));
		
		//싱글톤 패턴 사용
		Test﻿Singleton ts = Test﻿Singleton.getInstance();
		ts.test();
	}
}
