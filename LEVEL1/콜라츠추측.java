import java.util.Scanner;

public class 콜라츠추측 {
    class Solution {
        public int solution(int num) {
            int answer=0;
            long longnum=(long)num;

            while(longnum>1) {
                if(answer>500) {
                    answer=-1;
                    break;
                }

                if(longnum%2==0) {
                    longnum=longnum/2;
                }else if(longnum%2==1) {
                    longnum=(longnum*3)+1;
                }

                answer++;
            }
            return answer;
        }
    }
    }
}