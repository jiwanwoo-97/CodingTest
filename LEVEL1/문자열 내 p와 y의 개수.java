class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //문자에 p y 개수 비교
        // 같으면 true
        // 개수 비교할때 대문자 소문자 구별 x
        int countP=0;
        int countY=0;
        String[]strary=s.split("");
        for(int i=0;i<strary.length;i++) {
            if(strary[i].equals("P") || strary[i].equals("p")) {
                countP++;
            }else if(strary[i].equals("Y") || strary[i].equals("y")) {
                countY++;
            }

        }//for끝
        answer= countP==countY ? true : false;

        return answer;
    }
}