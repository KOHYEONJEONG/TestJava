package oot.Inheritance;

public class Test10_C1  extends Test10_Parent{
	
	public String s = "Child";// <-- 이렇게 부모 s를 덮어서 사용할 수도 있음.
	
	public void parentCall() {
		// super : 부모클래스 지칭하는 용어
		// super.변수명 : 변수명이 같을 경우, 부모꺼 쓰고 싶을때
		System.out.println("parentCall : "+super.s);
	}
	
	public void childCall() {
		
		System.out.println("childCall : "+s);
	}
}
