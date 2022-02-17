class Solution {
    public int solution(int[] nums) {


        int plus=0;
        int answer = 0;

        for(int i=0;i<nums.length;i++) {
            for(int j=i+1; j<nums.length;j++) {
                for(int k=j+1; k<nums.length;k++) {
                    plus=nums[i]+nums[j]+nums[k];
                    if(sosu(plus)==true) {
                        answer++;
                    }

                }
            }

        }

        return answer;
    }


    public static boolean sosu(int num) {
        for(int i=2;i<num; i++) {
            if(num%i==0)return false;
        }

        return true;

    }

}