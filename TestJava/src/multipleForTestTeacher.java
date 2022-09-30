
public class multipleForTestTeacher {
	public static void main(String[] args) {
		//j가 i보다 클때 공백을 그리겠다.
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			/*
				 * 
				 **   
				 ***  
				 **** 
				 ***** 
			 */
			System.out.println();
		}
		
		
		//피라미드(for문 사용했을 때)
		for(int i=0; i<5; i++) {
			//공백
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			
			//별(왼쪽)
			for(int l=0; l<=i; l++) {
				System.out.print("*");
				
			}
			
			//별(오른쪽)
			for(int r =0; r<i; r++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	   //피라미드(for문과 if문 조화)<--수정해야함.
	   for(int i=0; i<5; i++) {
		   for(int j=0; j<9; j++) {
			   if(j<4-i ||j>4+i) {
				   //공백
				   System.out.print(" ");
			   }else if(j<i*2) {
				   System.out.print("*");
			   }
		   }
		   System.out.println();
	   }
	   
	  
	}
}
