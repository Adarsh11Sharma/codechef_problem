
import java.util.Arrays;
import java.util.*;

public class Arithmetic {

    // Generic method to sum elements in an array
    public <T> T sum(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        return (T) (array[0] instanceof Integer ?
                Arrays.stream((Integer[]) array).mapToInt(Integer::intValue).sum() :
                Arrays.stream((String[]) array).reduce("", String::concat));
    }
    static int min(int []frames){
        int count = 1;
        for (int i = 0; i < frames.length- 1; i++) {
            if ( frames[i] != frames[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int j = 1; j <= T; j++) {
            int N = scanner.nextInt();
            int[] frames = new int[N];
            for (int i = 0; i < N; i++) {
                frames[i] = scanner.nextInt();
            }
            int res = min(frames);
            System.out.println(res);
        }
    }}