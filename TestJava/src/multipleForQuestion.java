
public class multipleForQuestion {
	public static void main(String[] args) {
		//사각형
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("2번");
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {//i가 기준
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("3번");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if((j+i+1)>5) {//1>5
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("4번");
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<5-i) {// 1 < 5 - i
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("5번");
		for(int i=5; i>=1; i--) {
			for(int j=0; j<5; j++) {
				if(j<5-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
		
		//for문으로만 풀기
		
		//      *
		//**
		//***
		//****
		//*****

		for(int i=0; i<5; i++) {

			for(int j=0; j< 1 + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//*****
		//****
		//***
		//**
		//*
		System.out.println();
		
		for(int i=0; i<5; i++) {

			for(int j=0; j< 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//*
		//**
		//***
		//****
		//*****
		System.out.println();

		for(int i=0; i<5; i++) {
			for(int j=0; j< 4 - i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j< 1 + i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//*****
		//****
		//***
		//**
		//*
		for(int i=0; i<5; i++) {
			for(int j=0; j< 0 + i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j< 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("6번:삼각형");
		for(int i=1; i<=5; i++) {
			for(int e=0; e<5-i; e++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<i*2; k++){
				// 
				System.out.print("*");
			}
			System.out.println();
			/*
			       *
			 	  ***
			 	 *****
			 	*******
			   *********
			 */
		}
		
		System.out.println("역삼각형-7번");
		int num=5;
		for(int i=0; i<=5; i++) {
			for(int e=0;e<i;e++) {
				System.out.print(" ");
			}
			for(int k=2*num-1; k>2*i; k--){
				System.out.print("*");
			}
			System.out.println();
			/*
			  *********
			   *******
			    *****
                 ***
                  * 
			 */
		}

		System.out.println("다이아-8번");
	    for (int i = 0; i < 5; i++) 
        {
           for (int j=i; j < 4; j++) {
              System.out.print(" ");
           }
           for (int k = 0; k <=(i*2); k++) {
              System.out.print("*");
           }
           System.out.println();
        }

        for (int i = 4; i > 0; i--)
        {
           for (int j = i; j <= 4; j++) {
              System.out.print(" ");
           }

           for (int k = 0; k <= ((i-1) * 2); k++) {
              System.out.print("*");
           }

           System.out.println();
        }
        /*
             *
            ***
           *****
          *******
         *********
          *******
           *****
            ***
             *
         */

        System.out.println("강사님-8번");
        /*강사님풀이 8번 - 다이아 */
        for(int i=0; i<9;i++){
        	//별찍기
        	for(int j=0; j<9; j++) {
        		if(j<4-i || j>4+i || j<i-4|| j>= 13-i) {
        			System.out.print(" ");
        		}else {
        			System.out.print("*");
        		}
        	}
        	System.out.println();
        }
        
        
        /*다른학생 풀이*/
		System.out.println();
		
	//예제 7번
	for(int i=0; i < 5; i++) {
		for(int j=0; j < 9; j++) {
			if(j-i <= -1 || i+j >= 9) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
//	*********
//	 ******* 
//	  *****  
//	   ***   
//	    *    
	System.out.println();

	//예제 8번
	for(int i=0; i < 9; i++) {
		for(int j=0; j < 9; j++) {
			if(j+i <= 3 || j+i >= 13 || j-i >= 5 || i-j >= 5) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
			}				
		System.out.println();
		}
//	     *    
//    ***   
//   *****  
//  ******* 
// *********
//  ******* 
//   *****  
//    ***   
//     *    
        	
        }
	}
