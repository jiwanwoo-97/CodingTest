import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int number;

        for(int i=0;i<arr.length;i++) {
            if(arr.length-1>i&&arr[i]==arr[i+1]&&arr[i]!=-1) {
                arr[i]=-1;
            }
        }

        int count=0;
        for(int arr1:arr) {
            if(arr1!=-1) {
                count++;
            }
        }

        answer=new int[count];
        int count2=0;
        for(int k=0;k<arr.length;k++) {
            if(arr[k]!=-1) {
                answer[count2]=arr[k];
                count2++;
            }
        }

        return answer;
    }
}