import java.util.Scanner;

public class 정수제곱근판별 {
    public long solution(long n) {

        double num = Math.sqrt(n);
        long answer=0;
        if(num-(int)num == 0 ) {
            answer = (long)Math.pow((int)num+1,2);
        }else {
            answer=-1;
        }
        return answer;
    }
}