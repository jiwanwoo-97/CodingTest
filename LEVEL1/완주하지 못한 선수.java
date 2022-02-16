import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<participant.length;i++) {
            String a = i == participant.length-1 ?  "":completion[i];
            if(!participant[i].equals(a)) {
                return participant[i];

            }
        }

        return null;
    }
}