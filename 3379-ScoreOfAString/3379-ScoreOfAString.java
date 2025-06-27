// Last updated: 6/27/2025, 11:56:16 AM
class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 1; i < s.length(); i++) {
            sum += Math.abs(s.charAt(i-1) - s.charAt(i));
        }
        return sum;
    }
}