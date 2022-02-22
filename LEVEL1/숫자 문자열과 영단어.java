class Solution {
    public int solution(String s) {
        int answer=0;
        int[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String[] strnum = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] strarr = s.split("");
        String str = "";
        String answer1 = "";
        for (String i : strarr) {

            str += i;
            for (int j = 0; j < 10; j++) {
                if (str.equals(strnum[j])) {

                    answer1 += num[j];
                    str = "";
                } else if (str.equals(String.valueOf(num[j]))) {

                    answer1 += num[j];
                    str = "";
                }

            }
        }
        answer=Integer.parseInt(answer1);
        return answer;
    }
}