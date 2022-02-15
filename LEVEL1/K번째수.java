import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int ancount=0;
        for(int i=0;i<commands.length;i++) {
            int count=0;
            int start=commands[i][0];

            int end=commands[i][1];
            int number=commands[i][2];
            int[]numArry=new int[end-start+1];

            for(int j=start-1;j<end;j++) {
                numArry[count++]=array[j];
            }
            Arrays.sort(numArry);
            answer[ancount++]=numArry[number-1];

        }
        return answer;
    }
}