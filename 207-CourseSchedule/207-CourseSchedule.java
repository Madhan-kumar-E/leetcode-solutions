// Last updated: 6/27/2025, 11:56:55 AM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

       
        int[] state = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(graph, state, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(List<List<Integer>> graph, int[] state, int course) {
        if (state[course] == 1) return true; 
        if (state[course] == 2) return false; 

        state[course] = 1; 
        for (int nextCourse : graph.get(course)) {
            if (hasCycle(graph, state, nextCourse)) {
                return true; 
            }
        }
        state[course] = 2; 
        return false;
    }
}
