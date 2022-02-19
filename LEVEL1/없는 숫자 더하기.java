import java.util.ArrayList;
class Solution {
    public int solution(int[] numbers) {
        int answer=0;
        int[] numberarry= {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer>arry= new ArrayList<>();
        for(int i=0; i<numberarry.length;i++) {
            arry.add(numberarry[i]);
        }
        for(int j=0; j<numbers.length;j++) {
            if(arry.contains(numbers[j])){
                arry.set(numbers[j],0);
            }
        }

        for(int k=0; k<arry.size();k++) {
            answer+=arry.get(k);
        }
        System.out.println(answer);
        return answer;
    }
}