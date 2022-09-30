
public class ClassTest {

	public static void main(String[] args) {
		// new : 객체 생성시점
		// 생성자 : 클래스명과 동일함. 초기구동
		// 클래스 객체명 = new 생성자();
		
		String a = "abc";
		System.out.println(a);
		System.out.println(a.hashCode());
		
		//. => ~에 있는
		
		Test09 ts = new Test09();
		ts.s = "1번";
		System.out.println(ts.s);//1번
		
		Test09 ts2 = new Test09();
		ts2.s = "2번";
		System.out.println(ts2.s);//2번
		
		ts = ts2;//연결한 주소를 ts2로 바꿔줌(주소가 끊어짐)
		System.out.println(ts.s);//2번
		//다시 ts에 주소를 접근할 수 있을까? no!!(주소를 저장해둔 공간이 없기때문에 주인이 없음. 그거를 '가비지(쓰레기)컬렉터=GC:청소부'가 청소해감.)
		
		int[] arr = {1,2,3,4};
		for(int index:arr){
		    System.out.print(index);
		}
		

	}

}
