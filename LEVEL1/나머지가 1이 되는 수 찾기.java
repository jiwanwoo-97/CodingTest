class Solution {
    public int solution(int n) {
        int count=2;
        int answer = 0;
        int temp=0;
        while(temp!=1) {
            temp=n%count;
            if(temp!=1) {
                count++;
            }else {
                answer=count;
            }
        }
        return answer;
    }
}