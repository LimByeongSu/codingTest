import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] first_answer = {1,2,3,4,5};
        int[] second_answer = {2,1,2,3,2,4,2,5};
        int[] third_answer = {3,3,1,1,2,2,4,4,5,5};
        int first=0;
        int second=0;
        int third=0;
        for(int i=0;i<answers.length;i++){
            if(first_answer[i%first_answer.length] == answers[i]){
                first++;
            }
            if(second_answer[i%second_answer.length] == answers[i]){
                second++;
            }
            if(third_answer[i%third_answer.length] == answers[i]){
                third++;
            }
        }
        int max = Math.max(first, Math.max(second,third));
        
        List<Integer> list = new LinkedList<>();
        if(max == first){list.add(1);}
        if(max == second){list.add(2);}
        if(max == third){list.add(3);}
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

//문제의 갯수가 10000개 이므로 3명 모두와 비교연산을 해봤자 30000번의 연산이다.