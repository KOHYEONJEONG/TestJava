package quiz;

public class Sosu {

	public static void main(String[] args) {
		//1은 소수가 아니다.
		//2는 짝수지만 소수이다.
		//나머지가 0일 경우 소수가 아니다.
		//0으로 나누어 떨어지지 않는 수가 소수임
		
		int count=0;
		//int len = 1;
		for(int i=2; i<100; i++) {//약수 마지막
			
			for(int j=2; j<=i; j++) {//약수들
				if(i%j==0) {//자기 자신보다 작은 수들을 나누어봐서 하나라도 나누어지면 소수가 아닌것.(어떤 수의 배수이면 안되는 것.)
					count++;//자기자신과 자기자신을 나누면 나머지는 0이 나오고 count는 1이다. 
				}
			}
			
			if(count==1) {//소수만 자기자신으로만 나눴으니까 나머지 0이 하나일거고 그 수가 출력된다.
				System.out.print(i+" ");
				//len++;
			}
			count=0;//진짜 중요
		}

		System.out.println();
		//System.out.println(len);
		
		System.out.println();
		for (int i = 1; i < 100; i++) {
			
	         for (int j = 2; j <= i; j++) {
	            if (i % j == 0 && i != j) {//둘다 true여야지 실행
	            	//i % j == 0 && i != j => 2%4==0 && 2!=4 -> 둘다 true이기때문에 break가 가능함.(아래 if문으로 넘어감)
	            	//i != j : 2~N 나눈 나머지, 어떤 수의 배수가 되면은 안된다.(1,2,4(4의약수)) , (1,3,9(9의약수))
	               break;//안쪽 반복문을 빠져나가서 if문을 실행함.(아래)
	            }
	            if (i == j) {
	               System.out.print(i+" ");
	            }
	         }//안쪽 for문
	      }
		System.out.println();
	
	}

}
