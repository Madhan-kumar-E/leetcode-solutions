// Last updated: 6/27/2025, 11:56:37 AM
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        int n = senate.length();
        
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') r.add(i);
            else d.add(i);
        }

        while (!r.isEmpty() && !d.isEmpty()) {
            int rIndex = r.poll();
            int dIndex = d.poll();

            if (rIndex < dIndex) {
                r.add(rIndex + n);
            } else {
                d.add(dIndex + n);
            }
        }

        return r.isEmpty() ? "Dire" : "Radiant";
    }
}
