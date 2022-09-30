package oot.Inheritance;

public class Test10 {

	public static void main(String[] args) {
		Test10_C1 c1 = new Test10_C1();
		
		c1.parentCall();//Test10_C1에서 부름 : 엄마!!
		
		c1.childCall();
	}
	

}
