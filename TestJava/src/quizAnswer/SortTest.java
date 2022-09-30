package quizAnswer;

public class SortTest {
	public static void main(String[] args) {
		SortTest s = new SortTest();
		int[] arr= {3,1,5,4,9,11};
		s.Descending(arr);
		System.out.println("\n\n");
		s.Ascending(arr);
	}

	private void Ascending(int[] arr) {//오름차순(작->큰)
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {//[0] > [1]
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("오름차순(작->큰)");
		for(int index : arr) {
			System.out.print(index+" ");
		}
	
	}

	private void Descending(int[] arr) {//내림차순
		int temp=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		System.out.println("내림차순(큰->작)");
		for(int index : arr) {
			System.out.print(index+" ");
		}
	}
}
