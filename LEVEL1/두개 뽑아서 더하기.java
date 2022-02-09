import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers) {
        int[] output = new int[numbers.length];
        boolean[] visited=new boolean[numbers.length];
        ArrayList<Integer>arry = new ArrayList<Integer>();
        perm(numbers,visited,output,0,numbers.length,2,arry);
        int[]answer = arry.stream().mapToInt(i -> i).sorted().toArray();
        return answer;
    }

    static void perm(int[]numbers, boolean[] visited ,int[] output ,int depth ,int n ,int r,ArrayList<Integer>arry) {
        if(depth == r) {
            int num=0;
            for(int i=0;i<output.length;i++) {

                num+=output[i];
            }
            if(!arry.contains(num)) {
                arry.add(num);
            }
            return;
        }
        for(int j=0; j<n; j++) {
            if(visited[j] != true) {
                visited[j]=true;
                output[depth]=numbers[j];
                perm(numbers,visited,output,depth+1,n,r,arry);
                visited[j]=false;
            }
        }

    }

}