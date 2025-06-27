// Last updated: 6/27/2025, 3:00:20 PM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
}