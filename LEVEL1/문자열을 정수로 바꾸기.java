class Solution {
    public int solution(String s) {

        return (s.substring(0,1).equals("-") ? -Integer.parseInt(s.substring(1)) : Integer.parseInt(s.substring(0))) ;
    }
}