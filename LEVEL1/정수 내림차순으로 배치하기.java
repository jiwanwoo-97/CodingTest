

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        ArrayList arry = new ArrayList<>();
        while (n > 0) {
            arry.add(n % 10);
            n = n / 10;
        }
        Collections.sort(arry, Collections.reverseOrder());
        String check = "";
        for (int i = 0; i < arry.size(); i++) {
            check += arry.get(i);
        }
        long answer = Long.parseLong(check);
        return answer;
    }
}
