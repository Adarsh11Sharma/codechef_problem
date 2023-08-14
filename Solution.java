//import java.io.*;
//import java.util.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//class Result {
//
//    /*
//     * Complete the 'numberOfWays' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts 2D_INTEGER_ARRAY roads as parameter.
//     */
//
//    public static int numberOfWays(List<List<Integer>> roads) {
//        // Write your code here
//
//        int n = roads.size() + 1;
//        List<List<Integer>> adj = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            adj.add(new ArrayList<>());
//        }
//        for (List<Integer> road : roads) {
//            int i = road[0] - 1;
//            int j = road[1] - 1;
//            adj.get(i).add(j);
//            adj.get(j).add(i);
//        }
//        int ans = 0;
//
//        int[] dist = new int[n];
//
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = i + 1; j < n - 1; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    Arrays.fill(dist, -1);
//                    dfs(i, 0, adj, dist);
//                    if (dist[j] != dist[k]) {
//                        continue;
//                    }
//                    Arrays.fill(dist, -1);
//                    dfs(j, 0, adj, dist);
//                    if (dist[i] == dist[k]) {
//                        ans++;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//
//    static void dfs(int x, int d, List<List<Integer>> adj, int[] dist) {
//        dist[x] = d;
//        for (int y : adj.get(x)) {
//            if (dist[y] == -1) {
//                dfs(y, d + 1, adj, dist);
//            }
//        }
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int roadsRows = Integer.parseInt(bufferedReader.readLine().trim());
//        int roadsColumns = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<Integer>> roads = new ArrayList<>();
//
//        IntStream.range(0, roadsRows).forEach(i -> {
//            try {
//                roads.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        int result = Result.numberOfWays(roads);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}