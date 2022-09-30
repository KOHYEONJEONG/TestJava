
public class switchTest {

	public static void main(String[] args) {
		int score = 66;
		
		switch((int)score/10) {//정수는 소점을 절사함.
		
		case 10: case 9://90~100
			System.out.println("A");
			break;
		case 8://80~89
			System.out.println("B");
			break;
		case 7://70~79
			System.out.println("C");
			break;
		case 6://60~69
			System.out.println("D");
			break;
		default://나머지
			System.out.println("F");
		}
	}

}
