package quiz;

public class Soinsubunhea {

	public static void main(String[] args) {
		//소수가 아닌 수를 계속 소수로 나눈다
		//작은 소인수부터 차례대로 나눈다.
		//몫이 소수가 되면 멈춘다.
		System.out.println("소인수분해_1");
		int num=24; 
		
		for(int j=2; j<=num; j++){
			
			while(num%j==0) {//나누어떨어지면
				System.out.print(j+" ");
				num/=j;//몫을 담는다.
			}
			
			/*
			 *2/24 =12 ( 나머지 0)     -> 나누는 수 : 2
			 *2/12 = 6(나머지 0)       -> 나누는 수 : 2 
			 *2/6 = 3(나머지 0)        -> 나누는 수 : 2
			 *2/3 <- false, j증가(2->3)
			 *3/3 = 1 (나머지 0)       -> 나누는 수 : 3
			 *4<=1 <-for문이 끝나서 종료
			 */
		}
		
		System.out.println();
		System.out.println("소인수분해_2");
		int num2=24;
		for(int i=2; i<=num2;) {
			if(num2%i==0) {
				System.out.print(i+" ");
				num2/=i;
			}else {
				i++;
			}
		}
		
		
		System.out.println();
		System.out.println("소인수분해_3");
		int num3=24;
		for(int i=2; i<=num3;i++) {
			if(num3%i==0) {
				System.out.print(i+" ");
				num3/=i;
				i--;
			}
		}
		

	}

}
