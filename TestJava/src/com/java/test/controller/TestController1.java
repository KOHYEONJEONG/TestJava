package com.java.test.controller;

import com.java.test.service.TestService1;//패키지가 다르기때문에 import해줘야함. 

//import : 파일의 위치를 지정함. 특정 파일이 아닌 경로 안에 있는 모든것을 지정할 겨웅
           //경로.*로 표기

public class TestController1 {

	public static void main(String[] args) {
		TestService1 ts = new TestService1();
	}

}
