class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4 || s.length()==6) {
            for(int i=0; i<s.length();i++) {
                int temp=s.charAt(i)-'0';
                System.out.println(temp);
                if(temp>10) {
                    answer=false;
                    break;
                }
                answer = true;
            }


        }
        return answer;
    }
}