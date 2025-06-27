// Last updated: 6/27/2025, 11:56:26 AM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i=0;
        Queue<Integer> q=new LinkedList<>();
        int count=0;
        for(int ele : students) q.add(ele);
        while(i<students.length)
        {
            if(sandwiches[i]==q.peek())
            {
                q.remove();
                count=0;
                i++;
            }
            else
            {
                q.add(q.peek());
                q.remove();
                count++;
                if(count==q.size()) return count;
            }
        }
        return 0;
    }
}