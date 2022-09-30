
public class arrayTest {

	public static void main(String[] args) {
		//int[] arr= {3,6,9};
		//System.out.println(arr[0]);

		//오름차순으로 정렬
		//버블정렬은 앞뒤 순서 시작 상관없다.
		//아래 방법은 '앞'부터 순서를 시작하였다.
		System.out.println("1)'앞'부터시작");
		int[] a = {20,7,5,3,10};
		int temp = 0;
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<(a.length-i-1); j++) {
				if(a[j]>a[j+1]) {
					System.out.print("i="+i+"j="+j+"\n");
					temp = a[j]; //큰 수를 담고 옮겨준다.
					a[j]=a[j+1];
					a[j+1] = temp;

				}
				for(int index : a) {
					System.out.print(index+" ");
				}
				System.out.println();
			}
		}
		
		System.out.println("\n앞에서부터 시작 결과 오름차순(버블정렬)");
		for(int index : a) {
			System.out.print(index+" ");
		}

		System.out.println("\n\n2)'뒤'부터시작");
		//오름차순으로 정렬
		//버블정렬은 앞뒤 순서 시작 상관없다.
		//아래 방법은 '뒤'부터 순서를 시작하였다.
		int[] a2 = {7,5,3,10,20,55,1};
		temp = 0;
		for(int i=a2.length; i>0; i--) {
			for(int j=i-1; j>0; j--) {
				if(a2[j]<a2[j-1]) {
					System.out.print("i="+i+"j="+j+"\n");
					temp = a2[j]; //큰 수를 담고 옮겨준다.
					a2[j]=a2[j-1];
					a2[j-1] = temp;
				}
				for(int index : a2) {
					System.out.print(index+" ");
				}
				System.out.println();
			}
			
			
		}
		
		System.out.println("\n뒤에서부터 시작 결과 오름차순(버블정렬)");
		for(int index : a2) {
			System.out.print(index+" ");
		}
		
		//함수도 있따!(면접에서 작성하면 혼나!)
		//int[] s = {20,7,5,3,10};
		//Array.sort(s)
		//for(int index:s){ System.out.print(index);}

	}

}
