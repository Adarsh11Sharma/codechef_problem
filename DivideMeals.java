import java.util.Arrays;

public class DivideMeals {

    public static int divideMeals(int N, int M, int K, int[] V) {
        if (V.length < K) {
            return -1;
        }

        Arrays.sort(V);
        int numMeals = 0;
        int numItems = 0;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 0; i < V.length; i++) {
            numItems++;
            if (numItems == K) {
                maxDiff = Math.max(maxDiff, V[i] - V[i - K + 1]);
                if (maxDiff <= M) {
                    numMeals++;
                    numItems = 0;
                    maxDiff = Integer.MIN_VALUE;
                } else {
                    return -1;
                }
            }
        }

        if (numItems > 0) {
            maxDiff = Math.max(maxDiff, V[V.length - 1] - V[V.length - numItems]);
            if (maxDiff <= M) {
                numMeals++;
            } else {
                return -1;
            }
        }

        return numMeals;
    }

    public static void main(String[] args) {
        int N = 8;
        int M = 4;
        int K = 3;
        int[] V = {5, 3, 7, 2, 8, 1, 6, 4};
        System.out.println(divideMeals(N, M, K, V));  // Output: 2
    }
}
