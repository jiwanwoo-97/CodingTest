import java.util.Scanner;

public class 핸드폰번호가리기 {
    class Solution {
        public boolean solution(int x) {
            int a=(int)(Math.log10(x)+1);
            int b=x;
            int sum=0;
            boolean answer = true;
            for(int i=0;i<a;i++) {
                sum+=b%10;
                b/=10;
            }
            if(x%sum==0) {
                answer=true;
            }else {
                answer=false;
            }
            return answer;
        }
    }
}