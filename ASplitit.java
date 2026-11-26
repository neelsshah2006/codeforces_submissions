import java.util.Scanner;

public class ASplitit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            if (n <= 2 * k) {
                System.out.println("NO");
                continue;
            }

            boolean valid = true;

            for (int i = 0; i < k; i++) {
                if (s.charAt(i) != s.charAt(n - 1 - i)) {
                    valid = false;
                    break;
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }

        sc.close();
    }
}