// Last updated: 6/27/2025, 11:56:40 AM
class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.lastIndexOf(c) == s.indexOf(c))
                return i;
        }
        return -1;
    }
}
