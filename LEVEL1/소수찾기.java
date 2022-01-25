import java.util.Arrays;
class Solution {
    public int solution(int n) {
        int answer=0;
        boolean[]check=new boolean[n];
        Arrays.fill(check,true);

        for(int i=2;i<=(int)Math.sqrt(n);i++) {
            if(check[i]==true) {
                for(int j=2;j*i<=n;j++) {
                    check[j*i]=false;
                }
            }
        }
        for(int k=2;k<=n;k++) {
            if(check[k]==true) answer++;
        }
        return answer;
    }
}