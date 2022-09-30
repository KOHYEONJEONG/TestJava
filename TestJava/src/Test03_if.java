
public class Test03_if {

	public static void main(String[] args) {
		int score = 78;
		
		if(score>=90) {//90~100
			System.out.println("A");	
		}else if (score>=80) {//80~89
			System.out.println("B");			
		}else if (score>=70) {//70~79
			System.out.println("C");
		}else if(score>=60) {//60~69
			System.out.println("D");
		}else {//나머지
			System.out.println("F");
		}
	}

}
