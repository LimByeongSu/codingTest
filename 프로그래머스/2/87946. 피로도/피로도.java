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

//bag()의 for문에서 i = index부터 시작하는 것과 i=0부터 시작하는 것의 차이
//이 문제는 결과적으로 같은 던전을 방문하더라도 방문 순서가 다르면 결과가 다르다. 즉 순서가 의미가 있어서 i=0부터 시작해야 (A,B,C), (A,C,B) 같은 상황을 모두 확인해야한다.
//i=0부터 시작해야 모든 경우의 수를 확인할수있고(순서가 의미있는 경우) i=index부터 시작하면 지나온 경우는 다시 바구니에 넣을수없다(순서가 의미없는 경우).
