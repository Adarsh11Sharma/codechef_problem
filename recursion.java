import java.util.Scanner;

public class recursion {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] frames = new int[N];
            for (int i = 0; i < N; i++) {
                frames[i] = scanner.nextInt();
            }

            int count = 0;
            for (int i = 1; i < N - 1; i++) {
                if (frames[i] == frames[i - 1] || frames[i] == frames[i + 1]) {
                    count++;
                }
            }

            System.out.println(count + 1);
        }

        scanner.close();
    }
}
