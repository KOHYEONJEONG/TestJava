
public class Fibonacci {
	//피보나치 수열 문제(규칙을 찾을 수 있는지)
	public static void main(String[] args) {
		//건축에서 많이 사용
		int sum1 = 1;
		int sum2 =1;
		int temp = 0;
		
		System.out.print(sum1+" ");
		System.out.print(sum2);
		for(int i=0;i<8; i++) {
			temp = sum1+sum2;
			System.out.print(" "+temp+" ");
			sum1 = sum2;
			sum2 = temp;
		}
		
		
		System.out.println();
		int s1=1;
		int s2=0;
		temp=0;
		for(int i=1;i<=10; i++) {
			temp = s1+s2;
			System.out.print(temp+" ");
			s1 = s2;
			s2 = temp;
		}
		
		System.out.println();
		
	}

}
