import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answerList = new int[arr.length];
        int count=0;
        int count2=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]%divisor==0) {
                answerList[i]=arr[i];
                count++;
            }else {
                answerList[i]=-1;
            }
        }

        int[]answer=new int[count>0?count:1];
        if(count==0) {
            answer[0]=-1;
        }

        for(int j=0;j<arr.length;j++) {
            if(answerList[j]!=-1) {
                answer[count2++]=answerList[j];
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}