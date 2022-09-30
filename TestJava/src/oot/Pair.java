package oot;

public class Pair {

	int[] arr = {45,17,6,5,98};
	
	public void method(int num) {
		//int[] arr = {45,17,6,5,98};
		//int temp = 0;
		
//		//for(int j=0; j<arr.length;j++) {
//			//System.out.println(temp);
//			for(int i=0; i<arr.length; i++) {
//				System.out.println(temp+" "+arr[i]);
//				if(temp>arr[i]) {
//					temp = arr[i];
//				}
//			}
//		//}
//		System.out.println("검색결과: " + temp);
		
		
		int cha, fgk = 0; //cha 차이값, fgk는 가장가까운 값
		int comp = 1000; //comp 차이값과 비교
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i);
			if(arr[i]>num) {    // 7-5(o)
				cha = arr[i]-num;
				System.out.println(arr[i]+" : "+cha);
			}else {
				cha = num-arr[i]; //5-7(x)
				System.out.println(cha);
			}
			
			if(comp>cha) { //차이값이 comp랑 비교해서 더 작으면
				comp = cha;//차이값 저장
				System.out.println("comp: "+comp);
				fgk = arr[i];
			}else {
				continue;
			}
		}
		System.out.println(num+"과 가장 가까운 수 찾기 : "+fgk);
		
	}
	
	//or
	public void method2(int num) {//target
		//가까운값(Near) : 차이값의 절대값의 최소값.
		int min = Integer.MAX_VALUE;//int자료형의 값의 범위
		                             //차이값 비교 대상(임의로)
		int near = 0;//가까운 값을 저장할 변수
		
		for(int i=0; i<arr.length; i++) {
			int comp = Math.abs((arr[i]-num)); // 7-35 = -28 -> 28
			                                   // 35-7 = 28
			if(min > comp) {
				min = comp;//최소값 알고리즘(핵심)
				near = arr[i];//현재 비교한 위치에 가장 가까운운 변수넣기.
			}
		}
		
		System.out.println(num +"과 가장 가까운값 : "+near);
		
	}
	
	//or
	public void nearNum(int target){
	   int[] arr = {45,17,22,1,98};
	  
	   
	   int min = arr[0];//가까운 수를 담으려고
	   int cha = Abs(target, min);//비교한 수의 차이값 담으려고
	   
	   for(int i=1; i<arr.length; i++){
	       //차이가 작을 경우 최소값 교체
	       if(cha > Abs(target, arr[i])){
	             min = arr[i];
	             cha = Abs(target, arr[i]);
	       }
	   }
	   System.out.println(target+"과 가장 가까운 값 :"+min);
	   
	}

	public int Abs(int a, int b){ //차이를 절대값으로 돌려주는 메소드
	   int cha = a - b;
	   if(cha<0){
	        cha *= -1;
	   }
	   return cha;
	}
	
}
