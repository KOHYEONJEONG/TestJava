package oot.Abstract;

public class Main {

	public static void main(String[] args) {
		
		//객체를 바로 생성 못함(미완성 메소드 때문에)
		//추상클래스를 상속한 자식클래스를 생성하면 그 자식 클래스로는 객체를 생성할 수 있는 것이다. 
		Test11_abstract tp = new Test11_abstract_child();
		tp.play();//항상 자식클래스에서 재정의한게 실행된다.(야구하러가자x -> 축구하러가자)
		tp.move();
		
		Test11_abstract_child tc = new Test11_abstract_child();
		tc.play();
		tc.move();
		
		
		System.out.println("--------------------------------------");
		//좀 더 효율적이게 써볼까??
		//Animal은 추상클래스, Dog와 Cat은 자식 클래스
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {
		//Animal 자체는 매겨변수가 될 수 없다(추상클래스이기에)
		//자식 객체를 매개변수로 넣어주자.
		System.out.println(animal.kind);
		animal.sond();
	}

}
