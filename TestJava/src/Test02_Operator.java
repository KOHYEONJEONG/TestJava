
public class Test02_Operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//사칙연산
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//비교연산자
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//전처리와 후처리
		System.out.println(--a);
		System.out.println(a++);
		
		//복합대입연산자
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		
		//다항연산(&&와 ||(파이프라인) )
		System.out.println(a <= 5 || a>=7);//파이프라인은 둘다 false여야 false임, 하나라도 true면 true
		
		
	}
}
