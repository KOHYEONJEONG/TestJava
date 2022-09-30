
public class Test04 {

	public static void main(String[] args) {
		// 초기값 할당. 값 변경은 가능
		int a = 3;
		int b = 2;
		int c = 1;

		int num[] =new int[3];
		num[0] = a;
		num[1] = b;
		num[2] = c;

		//오름차순(작->큰) 정렬 구현. 각 초기값이 변경되어도 정렬이 가능해야함.

		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				if(num[i]<num[j]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}else {
					break;
				}
			}
		}

		for(int res: num) {
			System.out.print(res+" ");
		}
		System.out.println();

		int[] num2 = new int[]{3,2,1};
		sortAcendingArr(num2);
		for(int res: num2) {
			System.out.print(res+" ");
		}
		System.out.println();

		//큰거를 먼저 temp에 담고 위치변경해야함.
		int temp = 0;
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		}

		if(a>c) {
			temp = a;
			a = c;
			c = temp;
		}

		if(b>c) {
			temp = b;
			b = c;
			c = temp;
		}


		//출력
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
	
	//오름차순
	public static void sortAcendingArr(int[] arr){
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					//[첫번째돌기]
					//처음: 321 -> 231
					//두번째: 231 -> 2 1 3
					
					//[두번째돌기]
					//처음 : 2 1 3 -> 1 2 3
				}
			}
		}
	}

}
