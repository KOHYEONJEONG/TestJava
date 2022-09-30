package oot.Abstract;

public class Test11_abstract_child extends Test11_abstract {

	//왜?play를 작성안해주나요??
	//이미 완성이기 때문이다!! 그래서 오버라이딩할 거 아니면 또 완성시킬필요 없지?
	
	//미완성(추상메소드)를 완성해주자! <- 구현하기
	@Override
	public void move() {
		System.out.println("움직이는중");
		
	}
	
	//오버라이딩
	@Override
	public void play() {
		System.out.println("축구하러 가자");
	}

}
