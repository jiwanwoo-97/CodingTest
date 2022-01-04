import java.util.ArrayList;
import java.util.Arrays;

public class HINDEX {
    public static void main(String[] args) {
        int[] citation={3, 0, 6, 1, 5};
        int answer = 0;
        Arrays.sort(citation);
        ArrayList<Integer>arry=new ArrayList();
        for(int i=citation.length-1;  i>=0 ; i-- ){
            arry.add(citation[i]);
        }
        for(int j=0; j<citation.length; j++){
            int num=arry.get(j);
            if(num>=j+1){
                System.out.println(j);
             if(num>answer){
                 answer=j+1;
             }
            }
        }



    }

}
