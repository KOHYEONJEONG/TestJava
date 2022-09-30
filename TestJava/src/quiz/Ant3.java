package quiz;

import java.util.Scanner;

public class Ant3 {//개미수열
	/*
	 *  1 -> 길이1 (비교 안하고 바로 result=1)
		11 ->길이2 (for조건o, 1과1비교 result)
		12 -> 길이2
		1121 ->길이4
		122111->길이6
		112213[5]
		12221131[6]
		1123123111
		12213111213113
		11221131132111311231
	 * */
	
	/**
	 * 1) 기준 값을 할당한다.   (String[] point = {"1"};)
	 * 2) 기준 값과 다음 값을 비교하기.( i=1; i<point.length )
	 * 3) 다음 값이 같을 때 개수 증가( 1++)  ( if(point[i].equals(point[i+1]) {cnt++}
	 * 4) 다를 대 결과와 개수를 합쳐서 결과에 누적  else { result  = result + point[i] + cnt }
	 * 5) 기준 값을 새로 할당.                point = result.split("");
	 * 6) 다시 비교 반봅                    
	 * 7) 마지막에 다시 누적
	 * 8) 출력
	 * 9) 값들을 다시 초기화 
	 * 10) 결과 값이 대상 값으로 변경( result -> target )
	 */


	public static void main(String[] args) {
		//문자열.split(값)->배열로 반환,문자열.charAt(인덱스번호) 
		Scanner sc = new Scanner(System.in);
		System.out.print("stage : ");
		int stage = sc.nextInt();
		String result = ""; //출력
		
		for(int i=0; i <stage ;i++) {
			String[] point = result.split("");//대상을 쪼갤때 배열을 사용하자(비교대상)
			result = "";
			int cnt = 1;
			String ch ="1";
			
			for(int j=1; j<point.length; j++) {
				if(ch.equals(point[j])){//1.1 2.1
					cnt++;
				}else {
					//중간 누적
					result += ch + cnt;
					ch = point[j];
					cnt = 1;
				}
			}
			//마지막꺼 누적 
			result += ch + cnt;
			System.out.println(result);
		}
		
	}

}
