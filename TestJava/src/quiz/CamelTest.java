package quiz;

public class CamelTest {
	
	public static void main(String[] args) {
		CamelTest ct = new CamelTest();
		String str = "HELLO_WORLD_JAVA";
	
		String[] res1 = ct.method1(str);
		System.out.println("---나---");
		for(String index : res1) {
			System.out.print(index);//hello_World_Java
		}
		System.out.println();
		
		String res2 = ct.method2(str);
		System.out.println("\n---강사님1---");
		System.out.println(res2);
		
		String res3 = ct.method3(str);
		System.out.println("\n---강사님2---");
		System.out.println(res3);
	}

	private String[] method1(String str) {
		//_을 기준으로 대문자로 바꾼다.
		
		String param = str.toLowerCase();//전체 다 변경
		//System.out.println(param);
		
		String[] result = param.split("");//한글자씩 잘랐음.
		
		for(int i=0; i<result.length; i++) {
			if(result[i].equals("_")) {
				//_뒤에 있는 문자를 변경해야함.
				//32차이남(아니라고 함)
				
				//w = W (해당 글자에 대문자로 바꿔줌)
				result[i+1] = param.substring(i+1,i+2).toUpperCase();//W,j출력됐음
				//System.out.println(param.substring(i+1,i+2).toUpperCase());
			}
		}
		
		String toStr = "";
		for(int i=0; i<result.length; i++) {
			toStr += result[i];
		}
		//System.out.println("\nch: "+toStr);
		
		result = toStr.split("_");//다시 값 변경하기
		return result;
	}
	
	private String method2(String str) {
		//강사님
		String[] result = str.split("_");//result[0] : HELLO, result[1] : WORLD , result[2] : JAVA
		String s = result[0].toLowerCase(); // 첫줄은 그냥 소문자(카멜규칙)
		
		for(int i=1; i<result.length; i++) {
			s += result[i].substring(0,1).toUpperCase() + result[i].substring(1).toLowerCase();//두번째 단어부터는 첫글자만 대문자
			                                                   //substring(1) : [1]인덱스 ~ 끝까지
		}
		
		return s;
	}
	
	private String method3(String str) {
		str = str.toLowerCase();
		
		while(str.indexOf("_") != -1) {//값을 못찾으면 -1이고 찾으면 1이다.
			int idx = str.indexOf("_");
			System.out.println(str.substring(idx,idx+2));
			str = str.replace(str.substring(idx,idx+2),
					str.substring(idx+1,idx+2).toUpperCase());
			//str.substring(idx,idx+2) : _w
			//_w = W로 바꾸겠다.
		}
			
		return str;
	}
	
	

}
