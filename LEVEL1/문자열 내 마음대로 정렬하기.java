import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        char[]str= new char[strings.length];

        for(int i=0; i<strings.length;i++) {
            str[i]=strings[i].charAt(n);
        }

        Arrays.sort(str);
        Arrays.sort(strings);
        String[]answer = new String[strings.length];

        for(int j=0;j<strings.length;j++) {
            for(int k=0;k<strings.length;k++) {
                if(!strings[k].equals("")&&str[j]==strings[k].charAt(n)) {
                    answer[j]=strings[k];
                    strings[k]="";
                    break;
                }
            }
        }
        return answer;
    }
}