// Last updated: 6/27/2025, 11:57:37 AM
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        return s.equals(String.valueOf(str));
    }
}