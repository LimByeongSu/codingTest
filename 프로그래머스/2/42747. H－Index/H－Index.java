import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer=0;
        
        Arrays.sort(citations);
        
        for(int i=0;i<citations.length;i++){
            int h = citations.length - i;
            
            if(citations[i] >=h){
                return h;
            }
            
        }
        
        return 0;
    }
}
//풀이가 이해는 가는데 다음에 다시 풀 때 이 방식을 떠올릴수 있을지 모르겠다.