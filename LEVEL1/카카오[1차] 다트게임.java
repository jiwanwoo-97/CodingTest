public class Solution {

    public int solution(String dartResult)  {

        String[] dartArray = dartResult.split("");
        int[] answerArr = new int[3];
        System.out.println("길이" + dartArray.length);

        int answernum = 0; // 총합에 들어가기전
        int starcount = 0;
        int count = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            int dartnum = 0;
            if (i - 1 > 0) {
                if (dartArray[i].equals("0") && !dartArray[i - 1].equals("1")) {
                    if (i + 2 < dartArray.length) {

                        if (dartArray[i + 2].equals("*")) { // *들어왔을때
                            if (count == 0) {
                                answernum = dartnum * 2;
                                // 첫번째 스타상일 경우

                            } else {// 두번째 세번째 스타상일 경우

                                answernum = dartnum * 2;
                                answerArr[count - 1] *= 2;

                            }

                            starcount++;// 스타상 카운트

                        } // *들어왔을때 끝

                        else if (dartArray[i + 2].equals("#")) { // # 들어왔을때
                            answernum = dartnum * -1;

                        }

                        else {

                            answernum = dartnum;
                            System.out.println("뭘타" + answernum);
                        }
                    }
                    count++;

                }

            }
            if (dartArray[i].equals("1") || dartArray[i].equals("2") || dartArray[i].equals("3")
                    || dartArray[i].equals("4") || dartArray[i].equals("5") || dartArray[i].equals("6")
                    || dartArray[i].equals("7") || dartArray[i].equals("8") || dartArray[i].equals("9")) {
                int dart = Integer.parseInt(dartArray[i]); // 다트의 배열
                if (dartArray[i].equals("1") && dartArray[i + 1].equals("0")) {
                    dart = 10;
                    if (dartArray[i + 2].equals("S")) {
                        dartnum += Math.pow(dart, 1);

                    } else if (dartArray[i + 2].equals("D")) {
                        dartnum += Math.pow(dart, 2);

                    } else if (dartArray[i + 2].equals("T")) {
                        dartnum += Math.pow(dart, 3);

                    }
                }

                if (dartArray[i + 1].equals("S")) {
                    dartnum += Math.pow(dart, 1);

                } else if (dartArray[i + 1].equals("D")) {
                    dartnum += Math.pow(dart, 2);

                } else if (dartArray[i + 1].equals("T")) {
                    dartnum += Math.pow(dart, 3);

                } // dartnum의 제곱값

                if (dartArray[i].equals("1") && dartArray[i + 1].equals("0")) {
                    if (i + 3 < dartArray.length) {

                        if (dartArray[i + 3].equals("*")) { // *들어왔을때
                            if (count == 0) {
                                answernum = dartnum * 2;
                                // 첫번째 스타상일 경우

                            } else {// 두번째 세번째 스타상일 경우

                                answernum = dartnum * 2;
                                answerArr[count - 1] *= 2;

                            }

                            starcount++;// 스타상 카운트

                        } // *들어왔을때 끝

                        else if (dartArray[i + 3].equals("#")) { // # 들어왔을때
                            answernum = dartnum * -1;

                        }

                        else {

                            answernum = dartnum;
                        }
                    } else { // 아무것도 아닌경우에
                        answernum = dartnum;

                    }
                } else {
                    if (i + 2 < dartArray.length) {

                        if (dartArray[i + 2].equals("*")) { // *들어왔을때
                            if (count == 0) {
                                answernum = dartnum * 2;
                                // 첫번째 스타상일 경우

                            } else {// 두번째 세번째 스타상일 경우

                                answernum = dartnum * 2;
                                answerArr[count - 1] *= 2;

                            }

                            starcount++;// 스타상 카운트

                        } // *들어왔을때 끝

                        else if (dartArray[i + 2].equals("#")) { // # 들어왔을때
                            answernum = dartnum * -1;

                        }

                        else {

                            answernum = dartnum;
                            System.out.println("뭘타"+answernum);
                        }
                    } else { // 아무것도 아닌경우에
                        answernum = dartnum;

                    }
                }


                answerArr[count] = answernum; // 0 , 1, 2 에 담기

                count++;
            } // 숫자 if문 끝

        } // for문끝

        int answer = 0; // 총합
        for (int j = 0; j < answerArr.length; j++) {

            answer += answerArr[j];

        }
        return answer;
    }

}