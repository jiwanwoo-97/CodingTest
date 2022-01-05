import java.util.Scanner;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long save=0;
        long[] answer=new long[n];
        for(int i=0 ; i<n; i++ ) {
            save+=x;
            answer[i]=save;
        }
        return answer;
    }
}