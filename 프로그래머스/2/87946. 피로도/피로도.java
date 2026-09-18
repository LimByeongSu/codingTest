import java.util.*;

class Solution {
    private boolean[] visit;
    private int maxCount=0;
    
    public int solution(int k, int[][] dungeons){
        visit = new boolean[dungeons.length];
        bag(k, 0, 0, dungeons);
        
        return maxCount;
    }
    
    public void bag(int currentK, int index, int count, int[][] dungeons){
        maxCount = Math.max(maxCount, count);
        
        for(int i=0; i<dungeons.length; i++){
            if(dungeons[i][0] <= currentK && visit[i]==false){
                visit[i] = true;
                bag(currentK-dungeons[i][1], i+1, count+1, dungeons);
                visit[i] = false;
            }
        }
    }
}