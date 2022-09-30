package oot.polymorphism;

public class PolymorphismMain {
	//상속의 더형성
	public static void main(String[] args) {
		Polymorphism_parent pp = new Polymorphism_child();
		System.out.println(pp.name);
		//System.out.println(pp.age); <-- 자식 변수 사용불가
		System.out.println(pp.age2);
	}
	
}
