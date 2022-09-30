package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {//map은 hashMap을 가장 많이 사용!

	public static void main(String[] args) {
		//Map<타입클래스, 타입클래스> 변수명 = new HashMap<타입클래스,타입클래스>();
		Map<Integer, String>map = new HashMap<Integer, String>();
		//key는 int, value는 string
		
		//key가 int라고 인덱스 아님.
		//put(값1, 값2): 값1인 key에 값2를 넣는다.
		map.put(1, "가나다");
		map.put(2, "라마바");
		map.put(3, "사아자");
		
		//get(값) : 키중에 값과 같은 것의 내용을 가져온다.
		System.out.println(map.get(3));
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		//containsKey(값) : 값과 일치하는 키가 있는지 확인
		//containsValue(값) : 주어진 값과 일치하는 값이 맵에 존재하는지 확인
		System.out.println(map.containsKey(0));
		System.out.println(map.containsValue("사야자"));
		
		map.remove(1);
		System.out.println(map.get(1));
	}

}
