import java.util.*;

// 경우의 수를 구하는 문제인데 처음엔 "의상을 하나만 입는 경우의수 + 의상을 두개만 입는 경우의 수 ..." 이렇게 접근해서
// 시간이 오래걸렸던 문제였다.
// 의상의 종류가 각각 몇 가지인지 곱해서 경우의 수를 구하면 됐다.

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] s : clothes){
            map.put(s[1], map.getOrDefault(s[1], 0) +1);
        }

        for(String key : map.keySet()){
            answer *= (map.get(key)+1);
        }
        
        return answer - 1;
    }
}