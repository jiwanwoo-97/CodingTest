class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String[][]arry= {{"1","2","3"},{"4","5","6"},{"7","8","9"},{"*","0","#"}};
        int rightx=0;
        int righty=0;
        int leftx=0;
        int lefty=0;
        int count=0;
        String number="";
        for(int k=0;k<numbers.length;k++) {

            number = String.valueOf(numbers[k]);

            for (int i = 0; i < 4; i++) {

                for (int j = 0; j < 3; j++) {
                    if (k == 0 && count == 0) {
                        rightx = 3;
                        righty = 2;
                        leftx = 3;
                        lefty = 0;
                        count++;

                        // 시작점
                    }
                    if (number.equals(arry[i][j])) {
                        if (arry[i][j].equals("1") || arry[i][j].equals("4") || arry[i][j].equals("7")) {
                            answer += "L";
                            leftx = i;
                            lefty = j;
                            count++;

                        } else if (arry[i][j].equals("3") || arry[i][j].equals("6") || arry[i][j].equals("9")) {
                            answer += "R";
                            rightx = i;
                            righty = j;
                            count++;

                        }else {


                            int sum1 = Math.abs(rightx - i) + Math.abs(righty - j);
                            int sum2 = Math.abs(leftx - i) + Math.abs(lefty - j);

                            if(sum1>sum2) {
                                answer += "L";
                                leftx = i;
                                lefty = j;
                            }else if(sum1<sum2) {
                                answer += "R";
                                rightx = i;
                                righty = j;
                            }else if(sum1==sum2) {
                                if(hand.equals("left")) {
                                    answer += "L";
                                    leftx = i;
                                    lefty = j;

                                }else if(hand.equals("right")){
                                    answer += "R";
                                    rightx = i;
                                    righty = j;
                                }
                            }

                        }
                    }

                }




            }

        }
        return answer;
    }
}