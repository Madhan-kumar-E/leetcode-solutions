// Last updated: 6/27/2025, 2:48:45 PM
class Solution {
    public int climbStairs(int n) {
        if (n < 2) {
            return n;
        }
        
        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b;
    }
}