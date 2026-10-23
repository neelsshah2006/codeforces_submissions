import java.util.Arrays;
import java.util.Scanner;

public class DBalancedRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int m = 1;
            int len = 1;
            int maxLen = 0;
            while (m < n) {
                int diff = arr[m] - arr[m - 1];
                if (diff > k) {
                    maxLen = Math.max(maxLen, len);
                    len = 0;
                }
                len++;
                m++;
            }
            maxLen = Math.max(maxLen, len);

            System.out.println(n - maxLen);
        }
        sc.close();
    }
}