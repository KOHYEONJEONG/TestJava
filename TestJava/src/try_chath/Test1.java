package try_chath;

public class Test1 {
	public static void main(String[] args) {
		try {
			Integer.parseInt("abc");
			
			throw new ArrayIndexOutOfBoundsException();//2번째 방법 : ﻿throw : 뒤에 지정된 예외객체를 강제 발생(예외를 발생 시킴)
			
		}catch (NumberFormatException e) {
			System.out.println(e.toString());
			
		}catch (Exception e) {
			//printStackTrace() : 시스템에 현재 발생한 예외의 출력을 요청
			e.printStackTrace();//빨간글자로 출력
			
			//toString() : 발생한 예외 내용을 취득
			System.out.println(" ==>"+e.toString());//검은글자로 출력, NumberFormatException
		}
		//System.out.println("try~catch이후 실행");
		
		
		Test2 test2 = new Test2();
		try {
			test2.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//문법상 오류는 없지만, (시한폭탄)예외가 있을 수 있는애야(사용하려면 예외처리를 했으면 좋겠어)
		//finally는 많이 안씀.
	}
}
