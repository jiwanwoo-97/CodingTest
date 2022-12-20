import java.util.Arrays;


public class 가장가까운같은글자 {
    public int[] solution(String s) {

        int[] answer = new int[s.length()];
        int[] alpha = new int[26];

        Arrays.fill(alpha, -1);
        for (int i = 0; s.length() > i; i++) {
            if (alpha[s.charAt(i) - 'a'] == -1) {
                alpha[s.charAt(i) - 'a']++;
                answer[i] = -1;
            } else {
                String str = String.valueOf(s.charAt(i));
                int num = i - s.substring(0, i).lastIndexOf(str);
                answer[i] = num;
            }
        }
        return answer;
    }
}




}
