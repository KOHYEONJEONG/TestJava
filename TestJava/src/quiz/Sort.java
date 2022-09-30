package quiz;

public class Sort {
	public static void main(String[] args) {
		//내림차순 정렬(큰수->작은수)
		int[] arr= {3,1,5,4,9,11};
		int temp = 0;
		
		System.out.println("내림차순");
		//arr.length-1 : 뒤부터 하나씩 앞으로 정렬이됨.(그래서 맨마지막은 할 필요가 없음)
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=0; j<(arr.length-i-1); j++) {
				if(arr[j]<arr[j+1]) {//false면 if문 빠져나와서 j++
					//인접한 숫자 두개씩 묶어서 옮김.
					temp = arr[j]; //작은수를 담아서 뒤에 숫자랑 바꾼다.
					arr[j]=arr[j+1];
					arr[j+1] = temp;

				}
				System.out.println("------------------------");
				System.out.println("★i= "+i);
				for(int a: arr) {
					System.out.print(a+" ");
				}
				System.out.println("\n");
			}
		}
		
		System.out.println("최종");
		for(int index : arr) {
			System.out.print(index+" ");
		}
		
		
		System.out.println("\n");
		System.out.println("오름차순");
		int[] arr2 = {42, 456, 156, 123, 767};
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=i+1; j<arr2.length; j++) {
				if(arr2[i] > arr2[j]) { //오름차순
					int tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
				
				System.out.println("------------------------");
				System.out.println("★i= "+i);
				for(int a: arr2) {
					System.out.print(a+" ");
				}
				System.out.println("\n");
			}
		}
		
		System.out.println("최종");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
			if(i+1 != arr2.length) {
				System.out.print(", ");
			}
			
			
		}
	}
}
