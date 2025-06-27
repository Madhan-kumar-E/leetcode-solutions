// Last updated: 6/27/2025, 11:56:30 AM
class Solution {
  public String removeDuplicates(String s, int k) {

        Stack<Pair> stack = new Stack<>();

        ArrayDeque<Pair> arrayDeque = new ArrayDeque<>();

        for(char c : s.toCharArray()){

            if(arrayDeque.isEmpty()){
                arrayDeque.offer(new Pair(c , 1));
                continue;
            }

            Pair p = arrayDeque.peekLast();

            if(p.c == c){
                p.count++;
                if(p.count == k){
                    arrayDeque.pollLast();
                }
            }else{
                arrayDeque.offer(new Pair(c , 1));
            }



        }


        StringBuilder sb = new StringBuilder();

        while(!arrayDeque.isEmpty()){
            Pair p = arrayDeque.pollFirst();
            for(int i = 0 ; i < p.count ; i++){
                sb.append(p.c);
            }
        }

        return sb.toString();
    }

    class  Pair{
        char c ;

        int count;

        Pair(char c , int count){
            this.c = c;
            this.count = count;
        }
    }
}