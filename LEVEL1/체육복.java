import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Arrays.sort(reserve);
        Arrays.sort(lost);

        for(int k=0;k<reserve.length;k++) {
            for(int f=0;f<lost.length;f++) {
                if(reserve[k]==lost[f]) {
                    reserve[k]=-1;
                    lost[f]=-1;
                    answer++;
                }
            }
        }

        for(int i=0;i<reserve.length;i++) {
            if(reserve[i]!=-1 ) {
                for(int j=0;j<lost.length;j++) {
                    if(reserve[i]+1 == lost[j] || reserve[i]-1 == lost[j]) {
                        lost[j]=-1;
                        reserve[i]=-1;
                        answer++;

                    }
                }
            }
        }
        return answer;
    }
}