
package quiz;
public class ForthPlace {
//    public String solution(String phone_number) {
//        String answer = "";
//        int s = phone_number.length();
//        
//        System.out.println("길이 : "+s);
//        
//        for(int i=0; i<=s; i++ ){
//            if(s-4<i){
//                answer += "*";
//            }else if(s-4>i){
//                 answer += phone_number.charAt(i);
//            }
//        }
//        return answer;
//    }
	
	public String solution(String phone_number) {
        String answer = "";
        int s = phone_number.length();
        
        System.out.println("길이 : "+s);
        
        for(int i=0; i<s; i++ ){
            if(s-4<=i){
                answer += "*";
            }else{
            	//String은 접근방법 charAt(index)
                 answer += phone_number.charAt(i);
            }
            System.out.println(i+"번째 : "+answer);
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	ForthPlace s = new ForthPlace();
    	System.out.println("결과 : "+s.solution("01031021111"));
    	
	}
}