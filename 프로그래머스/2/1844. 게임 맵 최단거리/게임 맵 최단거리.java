import java.util.*;
class Solution {
    //상하좌우
    private static final int[] dr = {-1,1,0,0}; // 행(x축이 아님, row 변화량)
    private static final int[] dc = {0,0,-1,1}; // 열(y축이 아님, column 변화량)
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{0,0});
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            
            //상대 진영 도착
            if(r==n-1 && c==m-1){
                return maps[r][c];
            }
            
            //4방향 체크
            for(int i=0;i<4;i++){
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                //맵 바깥은 스킵
                if(nr < 0 || nr >= n || nc < 0 || nc >= m){
                    continue;
                }
                
                //갈수있는 곳 체크(갈수없는곳은 알아서 걸러짐)
                if(maps[nr][nc]==1){
                    maps[nr][nc] = maps[r][c]+1;
                    queue.add(new int[]{nr, nc});
                }
            }
            
        }
        
        return -1;
    }
}
//dfs로 풀려 했으나 무한루프를 어떻게 처리하는지에 대한 문제를 해결하지 못하고 다른 방법으로 푸는걸로 함