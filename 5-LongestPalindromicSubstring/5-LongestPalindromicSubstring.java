// Last updated: 6/27/2025, 11:57:40 AM
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0 , maxl = 0;
        for(int i=0; i<n; i++){
            int len1 = center(s,i,i);
            int len2 = center(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len>maxl){
                maxl=len;
                start =i-(len-1)/2;
            }
          
        }
          return s.substring(start,start+maxl);
    }
        static int center(String s, int left, int right){
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            return right-left-1;
        }
    
}