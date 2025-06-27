// Last updated: 6/27/2025, 11:56:48 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        return isValidAnagram(s, t);
    }
    private boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] charFrequencies1 = new int[128];
        int[] charFrequencies2 = new int[128];

        for (char ch1 : s.toCharArray()) {
            charFrequencies1[ch1]++;
        }
        for (char ch2 : t.toCharArray()) {
            charFrequencies2[ch2]++;
        }

        for (int i =0; i< charFrequencies1.length; i++) {
            if (charFrequencies1[i] != charFrequencies2[i]) {
            return false;
            }
        }
        return true;
    }
}