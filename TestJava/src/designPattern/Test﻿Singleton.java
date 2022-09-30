package designPattern;

public class Test﻿Singleton {

	// 공유 객체 변수 생성
	private static Test﻿Singleton instance;

	// 객체 취득용, 생성용 메소드(꼭 만들어주기)
	public static Test﻿Singleton getInstance() {
		// 객체 존재 여부 확인
		if (instance == null) {
			// 객체가 없으면
			instance = new Test﻿Singleton();

		}
		// 객체주소 반환
		return instance;
	}

	// 변수, 메소드 생성
	public void test() {
		System.out.println("공유메소드!");
	}

}
