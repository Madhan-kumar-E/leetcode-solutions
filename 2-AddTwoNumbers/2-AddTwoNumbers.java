// Last updated: 6/27/2025, 11:57:42 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode tail = ans;
        int c = 0;
        while(l1!=null || l2!=null || c!=0){
            int d1 = (l1!=null)?l1.val:0;
            int d2 = (l2!=null)?l2.val:0;
            int sum=d1+d2+c;
            int res=sum%10;
            c=sum/10;
            ListNode node = new ListNode(res);
            tail.next=node;
            tail=node;
            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        return ans.next;
    }
}