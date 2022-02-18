class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        //signs[i] = true     ,false
        //absolutes[i] (+)    ,minus

        for(int i=0;i<absolutes.length;i++) {
            if(signs[i]==true) {
                continue;
            }else if(signs[i]==false) {
                absolutes[i]=-absolutes[i];
            }
        }
        for(int j :absolutes ) {
            answer+=j;
        }
        return answer;
    }
}