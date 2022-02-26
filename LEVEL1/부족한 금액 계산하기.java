class Solution {
    public long solution(int price, int money, int count) {
        long temp=0;
        for(int i=1; i <= count ; i++) {
            temp +=price*i;
        }
        long answer = money-temp>-1 ? 0 : -(money-temp);

        return answer;
    }
}