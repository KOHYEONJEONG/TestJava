
public class forTest {

	public static void main(String[] args) {
		
		
		//방법1
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println("합계 : "+ sum);
		
		//방법2
		sum = 0;
		for(int i=0; i<=100; i+=3) {
			
			sum += i;
			
		}
		System.out.println("합계 : "+ sum);
		
		//방법3
		sum = 0;
		for(int i=0; i*3<=100; i++) {
			
			sum += i*3;
			
		}
		System.out.println("합계 : "+ sum);
		
		
	}

}
