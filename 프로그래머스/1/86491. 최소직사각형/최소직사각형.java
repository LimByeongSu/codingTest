import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int xMax = 0;
        int yMax = 0;
        for(int[] i : sizes){
            int x = Math.max(i[0],i[1]);
            int y = Math.min(i[0],i[1]);;
            
            xMax = Math.max(xMax, x);
            yMax = Math.max(yMax, y);
        }
        
        return xMax*yMax;
    }
}

//문제를 해결하는 아이디어를 떠올리기 어려웠음.