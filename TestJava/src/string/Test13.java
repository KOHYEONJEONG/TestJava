package string;

public class Test13 {
	//스트링
	public static void main(String[] args) {
	String s = "Hello World";
	
	
	//﻿문자열.concat("추가할 문자열");﻿
	System.out.println(s +"!!");
	System.out.println(s.concat("!!"));
	
	//substring(숫자) : 숫자 인덱스 이상을 가져온다.
	//substring(숫자1, 숫자2) : 숫자1인덱스 이상, 숫자2 인덱스 미만의 범위를 가져온다.
	System.out.println(s.substring(2));//llo World
	System.out.println(s.substring(7,10));//orl

	// replace(값1, 값2) : 값1을 찾아서 값2로 변경
	System.out.println(s.replaceAll("l", "k"));
	System.out.println(s.replaceFirst("l", "k"));
	
	//﻿indexOf와 lastIndexOf
	System.out.println(s.indexOf("l"));//2
	System.out.println(s.indexOf("l",4));//9 (0부터 시작)
	System.out.println(s.lastIndexOf("l"));
	System.out.println(s.lastIndexOf("l",3));
	
	
	//trim() : 공백제거
	String s2 = "      HaHa     ";
	System.out.println(s2);
	System.out.println(s2.trim());
	
	//split(값) : 값이 일치하는 곳을 기준으로 문자열을 자르고 배열로 변환
	String s3 = "사과,밤,토마토";
	String[] temp = s3.split(",");
	System.out.println(temp[0]);//사과
	System.out.println(temp.length);//3
	
	
	}
}
