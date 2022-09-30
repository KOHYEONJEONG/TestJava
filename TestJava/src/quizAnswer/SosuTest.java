package quizAnswer;

public class SosuTest {
	public static void main(String[] args) {
		//1은 소수가 아니다.
		//2는 짝수지만 소수이다.
		//나머지가 0일 경우 소수가 아니다.(짝수는 무조건 아니다)
		//0으로 나누어 떨어지지 않는 수가 소수이다.(1,3,13,39)
		
		int count = 0;//count가 1이상이면 소수가 아니다.
		for(int i =2;i<=100;i++) {
			for(int j=2; j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==1) {
				System.out.print(i+" ");
			}
			count = 0;
		}
		
	}
}
