package try_chath;

public class Test2 {
	// 예외처리 3번째 방법
	//﻿ throws : 예외가 발생할 수도 있는 상태. 안전장치, 복수지정 가능
	// 메소드 사용처에 문제가 발생할 수도 있어서 알림.
	public void test() throws Throwable, Exception{
		System.out.println("test메소드");
	}
}
