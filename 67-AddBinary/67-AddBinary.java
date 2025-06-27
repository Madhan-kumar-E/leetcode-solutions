// Last updated: 6/27/2025, 11:57:15 AM
class Solution {
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) {
      if (i >= 0)
        carry += a.charAt(i--) - '0';
      if (j >= 0)
        carry += b.charAt(j--) - '0';
      sb.append(carry % 2);
      carry /= 2;
    }

    return sb.reverse().toString();
  }
}