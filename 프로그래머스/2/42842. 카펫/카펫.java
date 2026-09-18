import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; 
        int total = brown + yellow;
        
        for(int i=3;i<=Math.sqrt(total);i++){
            if(total%i != 0)
                continue;
            int H = i;
            int W = total/i;
            
            if( yellow == (W-2)*(H-2) ){
                answer = new int[]{W, H};
            }
        }
        
        return answer;
    }
}

//점화식을 찾다가 틀린 방법같아서 확인해보니 yellow와 W, H관계로 푸는 문제였다.