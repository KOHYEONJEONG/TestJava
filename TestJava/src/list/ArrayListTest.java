package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// Array형태로 값을 보관.

		//add(값): 리스트에 값 추가
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("DEF");

		//add(인덱스번호, 값): 인덱스번호 위치에 값 추가. 기존값은 번호 증가.
		list.add(1,"GHI");

		//size() : 리스트의 개수를 가져옴.
		System.out.println(list.size());

		//일반for문 출력
		for(int i=0; i<list.size(); i++) {
			//get(인덱스번호) : 인덱스 번호의 값을 가져옴.
			System.out.print(list.get(i)+" ");//ABC GHI DEF 
		}

		//향상된 for문 출력
		for(String index: list) {//제네릭이랑 형태를 맞춰야함.
			System.out.print(index);
		}

		//set(인덱스번호, 값): 인덱스 번호위치의 값을 주어직 값으로 변경
		list.set(0,"abc");

		//향상된 for문 출력
		System.out.println();
		for(String index: list) {//제네릭이랑 형태를 맞춰야함.
			System.out.print(index+" ");
		}

		//remove(인덱스)
		list.remove(0);

		//향상된 for문 출력
		System.out.println();
		for(String index: list) {//제네릭이랑 형태를 맞춰야함.
			System.out.print(index+" ");
		}
		
		//isEmpty() : 비어있으면 true, 아니면 false
		System.out.println("비어있나요? \n"+list.isEmpty());//false
		
		//contains(값) : 리스트에 주어진 값과 일치한 값이 있는지 확인(없으면 false)
		System.out.println(list.contains("가나다"));//false
		
		//indexOf(값) : 주어진 값과 일치하는 값의 위치를 지정(없으면 -1로)
		System.out.println(list.indexOf("가나다"));
		
		//lastIndexOf(값) : 주어진 값과 일치하는 값의 위치를 뒤에서부터 지정(없으면 -1로)
		System.out.println(list.lastIndexOf("가나다"));
		
		
		//sort(null) : 오름차순 정렬
		list.sort(null);//영어랑 한글이 있으면 영어 먼저임.
		
		//향상된 for문 출력
		System.out.println();
		for(String index: list) { 
			System.out.print(index+" ");
		}
		System.out.println();
		
		//toString() : 출력가능한 값을 문자열의 형태로 취득
		System.out.println(list.toString());//[DEF, GHI]
		System.out.println(list);//[DEF, GHI]
		
		//toArray() : 리스트를 배열로 변환. 형변환이 필요함.
		//String[] temp = (String[])list.toArray();
		
		
		//clear() : 리스트를 비움
		list.clear();//전체삭제
		System.out.print(list.isEmpty());//true
		
		
		System.out.println("\n-----------------------------------------");
		//오름차순(작->큰)  sort(null) 사용금지
		List<Integer> num = new ArrayList<Integer>();
		num.add(9);
		num.add(5);
		num.add(7);
		num.add(3);
		num.add(10);
		
		System.out.println("초기값 : "+num.toString()+"\n");
		//복잡도가 높아질수록 순차정렬이 낮다!
		
		for(int i=0; i<num.size()-1; i++) {//3번만 돌면됨.(마지막은 어차피 정렬되어있음)
			System.out.println("\n길이 : "+ (num.size()-i-1));
			for(int j=0; j<num.size()-i-1; j++) {//마지막은 한행돌때마다 정렬되니까 점차 비교대상이 없기에 조건을 이렇게 적음.
				System.out.println(num.get(j)>num.get(j+1));
				if(num.get(j)>num.get(j+1)) {//버블정렬 (인접한값)
					int tmp = num.get(j+1);
					num.set(j+1, num.get(j));
					num.set(j, tmp);
				}
				System.out.println("확인: "+num.toString());
			}
		}
		
		System.out.print("\n정렬 후 => ");
		System.out.println(num.toString());
	}

}
