class Solution {
    public int[] solution(long n) {
        int num = (int)Math.log10(n)+1;
        int[] answer = new int[num];

        for(int i=0;i<num;i++) {
            answer[i]=(int)(n%10);
            n=n/10;
        }
        return answer;
    }
}