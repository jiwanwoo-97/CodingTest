import java.util.Scanner;

public class 자릿수더하기 {
   import java.util.*;

    public class Solution {
        public int solution(int n) {
            int answer=0;

            String[]numstr=String.valueOf(n).split("");
            for(int i=0;i<numstr.length;i++) {
                answer+=Integer.parseInt(numstr[i]);
            }

            return answer;
        }
    }
}