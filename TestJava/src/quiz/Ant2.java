package quiz;

import java.util.Scanner;

public class Ant2 {//개미수열
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
	


	public static void main(String[] args) {
		
		
		int count = 1;//count : 몇개있는지
		
		
		//문자열.split(값)->배열로 반환,문자열.charAt(인덱스번호) 
		Scanner in = new Scanner(System.in);
		System.out.print("stage : ");
		int stage = in.nextInt();
		String result = "";
		
		String change = "1";
		System.out.println(change);//처음은 출력
		String[] a = {};
		
		for(int i = 0; i<stage; i++) {
			
			//돌행 수
			for(int j=1; j<a.length; j++) {//안에 있는 숫자들 비교하려고
				
				//비교 (처음에는 비교하지 않음, 무조건 1)
				if(change.equals(a[j])) { //"1"=="1"
					count++;
				}else {
					result = result + change + count;//현재 비교대상 값 넣기.
					change = a[j];//현재 비교대상 체인지 바꿔야함.
					count = 1;//바꾼 대상의 총 횟수
				}
			
			}
			//System.out.println("out");
			result = result + change + count;
			//System.out.println("밖)result "+result);
			a = result.split("");
			
			//System.out.print(i + "번째");
			for(String index : a) {
				System.out.print(index+" ");
			}
			
			//초기화
			result = "";
			change = "1";
			count = 1;
			System.out.println();
			
		}
		
	}

}
