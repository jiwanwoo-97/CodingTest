class Solution {
    public long solution(int a, int b) {

        long answer = 0;

        long sum = 0;
        if (a==b) {
            answer = a;
        } else {
            int a1=(a>b)?b:a;
            int b1=(b>a)?b:a;
            for (int i = a1; i <= b1; i++) {
                sum=sum+i;
            }

            answer = Long.valueOf(sum);
        }
        return answer;
    }
}