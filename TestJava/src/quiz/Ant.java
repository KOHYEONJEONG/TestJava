package quiz;

public class Ant {//개미수열

	public void AntIteration(int stage) {//행수

		String init = "11";
		System.out.println(init);//무조건 출력
		for (int i = 0; i < stage; i++) {
			init= antMake(init); //실행할때마다 받고 객체호출(재귀x,주소를 계속 호출)
			System.out.println(init);//출력
		}
		System.out.println("끝!");
	}


	/**
	 * 베르나르 베르베르의 개미수열 로직
	 * @param init 입력받은 초기값
	 */
	public String antMake(String init) {
		//최종 결과를 누적하는 변수 concatenation
		String result = "";
		//모든 요소는 자신의 값 1회를 가지고 있음
		int cnt = 1;

		//처음의 비교대상의 기준이 되는 요소는 초기값으로 설정
		char ch = init.charAt(0);// '1'
		for (int i = 1; i < init.length(); i++) {//init.length(); <-- 문자열 길이
			if (ch == init.charAt(i)) {//문자열.charAt(인덱스)
				cnt++;
			} else {
				result = result + ch + cnt;
				System.out.println("안)result: "+result);
				ch = init.charAt(i);//비교할 값 바꾸기
				cnt = 1;//초기화
			}
		}//for문 끝
		
		
		result = result + ch +cnt;//마지막 비교 대상이 없으므로 그냥 저장.
		System.out.println("밖)result: "+result);
		return result;
	}

	public static void main(String[] args) {
		Ant ant =new Ant();
		ant.AntIteration(3);
	}

}
