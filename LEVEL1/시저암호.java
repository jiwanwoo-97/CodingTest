class Solution {
    public String solution(String s, int n) {
        String answer="";
        char[]sarry= s.toCharArray();
        for(int i=0; i<sarry.length;i++) {
            int sum=sarry[i]+n;
            if(!String.valueOf(sarry[i]).equals(" ")) {
                if(sum>90 && sarry[i]<=90 || sum>122 && sarry[i]>=97) {
                    answer+=(char)(sum-26);
                }else {
                    answer+=(char)(sum);
                }
            }else {
                answer+=" ";
            }
        }
        return answer;
    }
}