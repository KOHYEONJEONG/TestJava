package oot;

public class CalculaterMain {
	public static void main(String[] args) {
		Calculater obj = new Calculater();
		
		System.out.println(obj.cal(2, 2, "+"));
		System.out.println(obj.cal(2, 2, "-"));
		System.out.println(obj.cal(2, 2, "*"));
		System.out.println(obj.cal(2, 2, "/"));
		System.out.println(obj.cal(2, 2, "%"));
	}
}
