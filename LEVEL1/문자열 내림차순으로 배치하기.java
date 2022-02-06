import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String reanswer="";
        char[]str=s.toCharArray();
        Arrays.sort(str);
        for(int i=0; i<str.length;i++) {
            reanswer+=String.valueOf(str[i]);

        }
        return new StringBuffer(reanswer).reverse().toString();
    }
}