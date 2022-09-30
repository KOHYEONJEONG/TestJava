package oot;

public class Calculater {
	
	public int cal(int x, int y, String op) {
		int result = 0;
		
		switch (op) {
		case "+":
			result = x+y;
			break;
		case "-":
			result = x-y;
			break;
		case "*":
			result = x*y;
			break;
		case "/":
			result = x/y;
			break;
		case "%":
			result = x%y;
			break;
		default:
			result = 0;
			break;
		}
		
		return result;
	}
}
