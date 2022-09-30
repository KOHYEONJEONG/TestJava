
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        
//        long d = 0;
//        for(int i=0; i<answer.length; i++){
//            d += x;
//            answer[i] = d;
//        }
        
        for(int i=1; i<=n; i++) {
        	answer[i-1] = i*x;
        }
        
        return answer;
        
    }
    
    public static void main(String[] args) {
    	Solution so = new Solution();
    	long[] res= so.solution(2,5);
        
    	
    	for(long result : res) {
    		System.out.print(result);
    	}
    	
	}
    
   
    
}