class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int count=0;

        int maxcount=0;

        int mincount=0;

        int zerocount=0;


        for(int i=0;i<lottos.length;i++) {
            if(lottos[i]==0) {
                zerocount++;
            }
            for(int j=0;j<lottos.length;j++) {
                if(lottos[i]==win_nums[j]) {
                    count++;
                }

            }
        }//로또 일치번호 최솟값

        if(count<=1) {
            mincount=6;
        }else if(count>=2) {
            mincount=6-(count-1);
        }

        maxcount=mincount-zerocount;
        if(count==0 &&zerocount==1) {
            maxcount=6;
        }else if(count==0 && zerocount>=1) {
            maxcount++;
        }
        if(maxcount==0
        ) {
            maxcount=1;
        }

        int[]answer= {maxcount,mincount};

        return answer;
    }
}