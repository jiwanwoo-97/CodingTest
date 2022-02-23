class Solution {
    public String solution(String new_id) {
        String answer = "";

        // 1.소문자 치환

        new_id = new_id.toLowerCase();
        // 2.특수 문자 제거
        new_id = new_id.replaceAll("[^-._a-z0-9]", "");

        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }
        // 3. 마지막 . 제거

        if (new_id.length() > 0) {
            if (new_id.charAt(0) == '.') {
                new_id = new_id.substring(1, new_id.length());
            } else if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        // 4.문자가 3개 이상이여야함 안그럼 마지막 값 추가

        // 5.15자리 넘어가면안됨
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
        }
        if (new_id.isEmpty()) {
            new_id = "a";
        }

        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        while (new_id.length() < 3) {
            new_id += new_id.substring(new_id.length() - 1);
        }

        answer = new_id;
        return answer;
    }
}