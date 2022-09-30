package com.java.test.controller;

import java.util.Scanner;

public class TestController3 {
	public static void main(String[] args) {
		//Scanner : 입력을 지원하는 클래스
		//Scanner 변수명 = new 생성자(입력객체);
		//System.in : Java를 통해서 데이터를 입력받는 객체
		Scanner sc = new Scanner(System.in);
		
		//nextLine() : 입력 대기상태에 있다가 엔터가 입력되면 엔터 직전까지 취득(Enter가 인식되야지 멈춤)
		String s = sc.nextLine();
		System.out.println(s);
		
		int i= sc.nextInt();
		System.out.println(i);
		
		//next()는 nextLine()과 같이 사용해야함.
		String s2 = sc.next();//enter가 남음, 그래서 nextLine()이 남게되며 누적값을 읽어버린다.
		System.out.println(s2);
		
		sc.nextLine(); //그래서 남은 enter처리를 해줘야 한다.
		
	}

}
