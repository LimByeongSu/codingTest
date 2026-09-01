class Solution {
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        answer=0;
        a(numbers, target, -1, 0);
        
        return answer;
    }
    
    public void a(int[] numbers, int target, int dep, int sum){
        if(dep==numbers.length-1){
            if(sum==target){
                answer++;
            }
            return;
        }
        
        
        a(numbers, target, dep+1, sum+numbers[dep+1]*1);
        a(numbers, target, dep+1, sum+numbers[dep+1]*-1);
        
    }
}