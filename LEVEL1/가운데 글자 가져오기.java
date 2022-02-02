class Solution {
    public String solution(String s) {
        String answer="";
        int min;
        int max;

        if(s.length()%2==0) {
            min= s.length()/2-1;
            max=s.length()/2+1;

            answer=s.substring(min,max);

        }else if(s.length()%2==1) {
            min= s.length()/2;
            max=s.length()/2+1;
            answer=s.substring(min,max);
        }

        return answer;
    }
}