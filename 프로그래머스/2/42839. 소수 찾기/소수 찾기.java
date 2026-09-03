import java.util.*;

class Solution {
    private HashSet<Integer> set = new HashSet<>();
    private boolean[] visit;
    
    public int solution(String numbers) {
        int answer = 0;
        visit = new boolean[numbers.length()];
        dfs(numbers,"",0);
        
        for(int i : set){
            if(isPrime(i)){
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(String numbers, String current, int depth){
        if(!current.isEmpty()){
            set.add(Integer.parseInt(current));
        }
        if(depth == numbers.length()){
            return;
        }
        
        for(int i=0;i<numbers.length();i++){
            if(!visit[i]){
                visit[i] = true;
                dfs(numbers, current+numbers.charAt(i), depth+1);
                visit[i] = false;
            }
        }
    }
    
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

//모든 경우의 수를 만드는 방법으로 dfs(visit[]를 통한 백트래킹) + set(중복제거)를 사용
// 이 방식이 가장 많이 쓰이는 방식이니 형태를 외워둘 것
//일반 dfs와 다르게 for문과 visit[]를 사용한 형태  