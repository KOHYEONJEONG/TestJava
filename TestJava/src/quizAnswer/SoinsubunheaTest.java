package quizAnswer;

public class SoinsubunheaTest {
	
	public void method(int target) {
		int num = target;
		for(int i=2; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				num/=i;
				i--;
			}
			//System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		SoinsubunheaTest st = new SoinsubunheaTest();
		st.method(24);
	}
}
