class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            boolean number=false;
            for(int j=1; j<=i; j++) {
                if(j*j==i) {
                    answer-=i;
                    number=true;
                    break;
                }
            }
            if(number==false) {

                answer+=i;
            }
        }

        return answer;
    }
}