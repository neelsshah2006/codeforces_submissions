
import java.util.Scanner;

public class BPushingBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            char[][] s = new char[n][m];

            for (int i = 0; i < n; i++) {
                s[i] = sc.next().toCharArray();
            }

            boolean ans = true;

            for (int i = 1; i < n && ans; i++) {
                for (int j = 1; j < m && ans; j++) {

                    if (s[i][j] == '1') {
                        boolean top = true;
                        boolean left = true;

                        for (int k = 0; k < i; k++) {
                            if (s[k][j] == '0') {
                                top = false;
                            }
                        }

                        for (int k = 0; k < j; k++) {
                            if (s[i][k] == '0') {
                                left = false;
                            }
                        }

                        if (!top && !left) {
                            ans = false;
                        }
                    }
                }
            }

            System.out.println(ans ? "YES" : "NO");
        }

        sc.close();
    }
}
