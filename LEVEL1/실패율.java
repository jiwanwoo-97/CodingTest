import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[]answer=new int[N];
        double[]temp=new double[N];
        ArrayList<Double> arry = new ArrayList<>();
        for(int j=0; j<N; j++) {
            double bunmo=0;//분모
            double bunja=0;//분자

            for(int i=0; i<stages.length;i++) {

                if(stages[i]>0) {
                    bunmo++;
                }
                if(stages[i]==j+1) {
                    bunja++;
                    stages[i]=-1;
                }

            }

            if(bunja==0) {
                arry.add(0.0);
                temp[j]=0;
            }else {
                arry.add(bunja/bunmo);
                temp[j]=bunja/bunmo;
            }
        }

        Collections.sort(arry,Collections.reverseOrder());


        for(int k=0;k<arry.size();k++) {
            for(int c=0;c<temp.length;c++) {
                if(arry.get(k)==temp[c]) {
                    temp[c]=-1;
                    answer[k]=c+1;
                    break;

                }
            }
        }
        return answer;
    }
}