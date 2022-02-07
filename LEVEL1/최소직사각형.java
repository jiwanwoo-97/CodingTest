class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x=sizes[0][0];
        int y=sizes[0][1];

        for(int i=0;i<sizes.length;i++) {

            if(x<sizes[i][0]) {
                x=sizes[i][0];
            }
            if(y<sizes[i][1]) {
                y=sizes[i][1];
            }

        }
        int answertemp=0;
        for(int j=0;j<sizes.length;j++) {
            int temp= sizes[j][0] > sizes[j][1] ? sizes[j][1] : sizes[j][0];
            if(answertemp<temp) {
                answertemp=temp;
            }
        }

        int number1=x > y ? x : y;

        answer=number1*answertemp;
        return answer;
    }
}