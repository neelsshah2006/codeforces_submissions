import java.util.Scanner;

public class CYetAnother2Or1Problem {
    private static boolean allSame(StringBuilder s) {
        int n = s.length();
        char c = s.charAt(0);
        boolean ans = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != c) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    private static boolean palindrome(StringBuilder s) {
        int n = s.length();
        int h = n / 2;
        boolean ans = true;
        for (int i = 0; i < h; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    private static void solve(StringBuilder s, int k) {
        while (k > 0) {
            int n = s.length();
            if (allSame(s)) {
                s.append(String.valueOf(s.charAt(n - 1)).repeat(k));
                break;
            }

            if (palindrome(s)) {
                s.append(s.charAt(n - 1));
            } else {
                s.delete(n / 2, n);
            }

            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, k;
        StringBuilder s;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            s = new StringBuilder(sc.next());
            solve(s, k);
            s.append("\n");
            sb.append(s);
        }
        sc.close();
        System.out.println(sb);
    }
}