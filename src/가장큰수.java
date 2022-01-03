import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 가장큰수 {
    public static void main(String[] args) {
        //1.앞자리가 가장큰수가 맨앞
        //모든 경우의 수를 계산?
        //1. 앞자리수가 큰게 1번째
        //2. 앞자리 수가 같으면 , 두번째로 비교
        //3. 3번째 자리수 까지 비교 가능
        //4. 같은 자리수 다음 0 이 오면 ,자리수가 더작은것을 앞에둠

        // 그후에 arrayList에 담아서 가장큰수를 추출
        int[] numbers = {23, 232, 21, 212};
        int[] temp = new int[numbers.length];
        ArrayList<Integer>arry= new ArrayList<>();
        String answer="";

        for(int i=0; i< numbers.length;i++){
            if( i!= numbers.length-1 && location(numbers[i])==location(numbers[i+1]) ){
                int num1=numbers[i];
                int num2=numbers[i+1];
                boolean changetrue=numberChange(numbers[i],numbers[i+1]);
                if(changetrue==true){
                    numbers[i]=num2;
                    numbers[i+1]=num1;
                    temp[i]=location(numbers[i]);
                }else{
                    temp[i]=location(numbers[i]);
                }
            }else{
                temp[i]=location(numbers[i]); // 같지않을때
            }

        }
        Arrays.sort(temp);
        for(int j=0; j< numbers.length;j++){
            for(int k=0; k< numbers.length; k++){
                if(temp[j] == location(numbers[k]) && numbers[k]!=-1){
                   arry.add(numbers[k]);
                   numbers[k]=-1;
                }

            }
        }
        Collections.reverse(arry);
       for(int f=0; f<arry.size();f++){
           answer+=arry.get(f);
       }
        System.out.println("하이");



    }

    public static int location(int num){
        int n=0;
        int location=(int)(Math.log10(num)+1);
        if(location==1){
            n= num%10;
        }else if(location==2){
            n= (num%100)/10;
        }else if (location==3){
            n= (num%1000)/100;
        }else if(location==4){
            n=(num%10000)/1000;
        }
    return n;
    }

    public static boolean numberChange(int num1,int num2){
        if(num1<num2){
            String strnum1=String.valueOf(num1);
            String strnum2=String.valueOf(num2);
            String substr=strnum2.substring(strnum1.length(),strnum2.length());
            if(strnum2.substring(strnum1.length(),strnum2.length())=="0") {
                System.out.println("호이");
                return true;
            }
            return false;
        }
        return false;
    }
}
