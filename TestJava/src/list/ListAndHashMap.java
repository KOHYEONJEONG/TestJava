package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListAndHashMap {

	public static void main(String[] args) {
		//묵묵형 데이터를 가져왔을때
		//게시판 목록을 가져왔을때
		//map은 hashMap을 가장 많이 사용!

		//vo를 안쓰고 만드는 방법(실제로 map을 더 많이 사용한다)

		List<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();

		//데이터 넣기
		for(int i=10; i>0; i--) {
			HashMap<String, String> data = new HashMap<String, String>();//각각 별개에 객체로 존재한다.(위치는 여기로해야한다)
			//DB에서 컬럼명이 대문자로 넘어오기 때문에 KEY값에는 대문자로 작성한다.
			data.put("NO",Integer.toString(i));
			data.put("TITLE","Test"+i);
			data.put("WRITER","Tester");

			list.add(data);
		}

		//LIST에 제너릭은 hashmap
		System.out.println("---------일반 for문-----------");
		for(int i=0; i<list.size(); i++) {
			//list.get(i)은 hashMap을 말하는거며 '해당 주소 map'
			//list.get(i).get("NO")은 해당주소의 Map.get("NO")
			System.out.println(list.get(i).get("NO")+"\t"
					+list.get(i).get("TITLE")+"\t"
					+list.get(i).get("WRITER")+"\t");
		}
		
		
		

		System.out.println("---------향상된 for문-----------");
		for(HashMap<String, String> data:list) {
			System.out.println(data.get("NO")+"\t"
					+ data.get("TITLE")+"\t"
					+data.get("WRITER"));
		}

		//오름차순으로 변환하여 결과를 출력
		//10~~1에 데이터가 들어있다.
		System.out.println("---------오름차순 for문-----------");
		for ( int j = 0 ; j<list.size() - 1; j++) {
	         for(int q = j+1; q < list.size(); q++) {
		         if(Integer.parseInt(list.get(j).get("NO"))>Integer.parseInt(list.get(q).get("NO"))){
		        	 //선택정렬 써서 바꿈
		        	 // 10 9 8 7
		        	 // 9 10 8 7 
		        	 // 8 10 9 7
		        	 // 7 10 9 8
		            HashMap<String, String> temp = list.get(q);
		            list.set(q, list.get(j));
		            list.set(j, temp);
		         }
	         }
	      }
		
		//강사님
//		HashMap<String, String> temp;
//		for(int i=0; i<list.size()-1; i++) {
//			for(int j=i+1; j<list.size(); j++) {
//				if(Integer.parseInt(list.get(i).get("NO"))> Integer.parseInt(list.get(i).get("NO"))){
//					temp = list.get(i);
//					list.set(i,  list.get(j));
//					list.set(j, temp);
//				}
//					
//			}
//		}
		
		//출력
		for(HashMap<String, String> data:list) {
			System.out.println(data.get("NO")+"\t"
					+ data.get("TITLE")+"\t"
					+data.get("WRITER"));
		}

	}

}
