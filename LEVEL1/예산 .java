import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int dsum=0;
        int answer=0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            dsum += d[i];
            if (budget >= dsum) {
                answer++;
            }else if(budget<=dsum) {
                break;
            }
        }

        return answer;
    }
}