import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ssarry = s.split("");
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(ssarry[i].equals(" ")) {
                count =0;
            }
            else if (count % 2 == 0) {
                ssarry[i] = ssarry[i].toUpperCase();
                count++;
            } else if (count % 2 == 1) {
                ssarry[i] = ssarry[i].toLowerCase();
                count++;
            }

            answer += ssarry[i];


        }
        return answer;
    }
}