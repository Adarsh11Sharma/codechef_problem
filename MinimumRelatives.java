import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumRelatives {
    public static int minimumRelatives(int input1, int input2, int[][] input3, int input4, int input5) {
        // Create an adjacency list representation of the relationships
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>(input1 + 1);
        for (int i = 0; i <= input1; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 0; i < input2; i++) {
            int relative1 = input3[i][0];
            int relative2 = input3[i][1];
            adjacencyList.get(relative1).add(relative2);
            adjacencyList.get(relative2).add(relative1);
        }

        // Perform BFS starting from John
        Queue<int[]> queue = new LinkedList<>();  // (relative, distance)
        boolean[] visited = new boolean[input1 + 1];
        queue.add(new int[]{input4, 0});
        visited[input4] = true;

        while (!queue.isEmpty()) {
            int[] currentRelative = queue.poll();
            int current = currentRelative[0];
            int distance = currentRelative[1];

            if (current == input5) {
                return distance;  // Found Dave
            }

            for (int relative : adjacencyList.get(current)) {
                if (!visited[relative]) {
                    queue.add(new int[]{relative, distance + 1});
                    visited[relative] = true;
                }
            }
        }

        return -1;  // Gift cannot reach Dave through relatives
    }

    public static void main(String[] args) {
        int[][] input3 = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3, 7}};
        System.out.println(minimumRelatives(7, 6, input3, 1, 7));  // Output: 2
    }

}
