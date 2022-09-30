package quiz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		//로또 번호 출력
		//로또 1번 = 1~45번 중 중복없이 6개 숫자
		
		int[] lotto = new int[6];// 0 0 0 0 0 0 (초기값)
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;//첫 시작값을 넣어줘야지 비교를 한다.
			//비교
			for(int j=0; j<i; j++) {
				//j<lotto.length; : 계속 나랑 비교하게 되기 때문에!! 무한루프에 빠져들게 된다!!.
				//★ j<i로 하는 경우는 지금 위치 인덱스 앞에것들만 비교하겠다는 뜻이기 때문에 무한루프에 빠지지 않는다.(j가 i보다 크기전까지) <-어차피 뒤에는 다 0이잖아?!
				System.out.print(lotto[i]+", "+lotto[j]+"\n");
				if(lotto[i]==lotto[j]) {
					System.out.print("중복 : "+lotto[i]+", "+lotto[j]);
					i--;
					break;//실행횟수를 줄인다는 개념(EX) 15 18 '19' 20 '비교위치(19)' 0
					      //비교위치가 인덱스[2]랑 이미 같기때문에 또 비교 반복문을 돌 횟수가 필요없지? 횟수를 줄일 수 있음.
						  //안적어도 상관없음.
				}
				System.out.println();
			}
			 /*
			 * 첫번째는 그냥 값만 대입
			 * n+1번째부터는 값을 비교해야해.(j<i)
			 */
		
		}
		
		
		for(int index : lotto) {
			System.out.print(index+" ");
		}
		
		
		
	}

}
