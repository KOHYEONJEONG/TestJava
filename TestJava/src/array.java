import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		//데이터를 연속된 공간에 나열하고 각 데이터에 인덱스(index)부여한 자료구조
		//같은 타입의 데이터만 저장할 수 있음
		//한 번 생성된 배열은 길이를 늘리거나 줄일 수 없다.
		
			Scanner sc = new Scanner(System.in);
	      
	      System.out.print("배열의 크기를 입력하세요 : ");
	      int vlength = sc.nextInt();
	      boolean flag = true;
	      String[] arr = new String[vlength];
	      

    	  for(int i =0; i<arr.length; i++) {
            System.out.print((i+1)+"번째 문자열:"); 
            arr[i] = sc.next();
             sc.nextLine();
         }
	      
    	  int arrLenght = arr.length;
    	  
	      while(flag) {
	    	  System.out.println("더 값을 입력하시겠습니까?(y/n)");
	    	  switch (sc.nextLine()) {
				case "y":
					 System.out.print("더 입력하고 싶은 개수 : ");
			         vlength = sc.nextInt();
			         String[] arr2 = new String[arrLenght + vlength];//배열길이 늘리기
			         
			         for(int i=0; i<arr.length; i++) {
			        	 arr2[i] = arr[i];
			         }
			        	         
			         System.out.println("새길이" + arr.length);
			         
			         for(int i=arr.length; i<arr2.length; i++) {
			        	 System.out.print((i+1)+"번째 문자열:"); 
			        	 arr2[i] = sc.next();
				         sc.nextLine();
			         }
			         arrLenght = arr2.length;
			         arr = arr2;
					break;
				case "n":
						flag = false;
					break;	
				}
	      }
	       
	      int i = 0;
	      System.out.print("[");
	      for(String index : arr) {
	    	  if(i<arr.length-1) {
	    		  System.out.print(index+", ");
	    	  }else {
	    		  System.out.print(index);
	    	  }
	    	  
	    	  i++;
	      }
	      System.out.print("]");
	      
	}

}
