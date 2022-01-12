import java.util.Scanner;

public class 최대공약수와 최소공배수{
  import java.util.ArrayList;
    class Solution {
        public int[] solution(int n, int m) {
            int[]answer= new int[2];
            int max=n>m ? n : m ;
            int min=n>m ? m : n ;

            ArrayList arry =new ArrayList();
            ArrayList arry2 =new ArrayList();

            for(int i=1; i<=n ; i++) {
                if(n%i==0) {
                    arry.add(i);
                }
            }
            for(int j=1; j<=m; j++) {
                if(m%j==0) {
                    arry2.add(j);
                }
            }
            for(int k=0; k<arry.size(); k++) {
                if(arry2.contains(arry.get(k))) {
                    if((Integer)arry.get(k)>=answer[0]) {
                        answer[0]=(Integer)arry.get(k);
                    }
                }
            }

            answer[1]=(n/answer[0])*(m/answer[0])*answer[0];

            return answer;
        }
    }
}