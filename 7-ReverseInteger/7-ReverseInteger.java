// Last updated: 6/27/2025, 11:57:39 AM
class Solution {
    public int reverse(int x) {
        int m=x;
        int sum=0;
        while(m!=0){
            int rev=m%10;
        if (sum > Integer.MAX_VALUE/10  || sum < Integer.MIN_VALUE /10){
            return 0;
        }
            sum=(sum*10)+rev;
            m=m/10;
        }
        return sum;
    }
}