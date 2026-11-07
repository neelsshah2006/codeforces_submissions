import java.util.Scanner;

public class BBeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean isInc = true;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) < s.charAt(i - 1)) {
                    isInc = false;
                    break;
                }
            }

            if (isInc) {
                ans.append(n + "\n");
                for (int i = 1; i <= n; i++) {
                    ans.append(i + " ");
                }
                ans.append("\n");
                continue;
            }

            boolean isPalindrome = true;
            int l = 0, r = n - 1;
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) {
                    isPalindrome = false;
                    break;
                }
                l++;
                r--;
            }

            if (isPalindrome) {
                ans.append("0\n\n");
                continue;
            }

            StringBuilder tmp = new StringBuilder();
            int cnt = 0;
            for (int i = l; i <= r; i++) {
                if (s.charAt(i) == '1') {
                    tmp.append((i + 1) + " ");
                    cnt++;
                }
            }
            ans.append(cnt + "\n" + tmp + "\n");
        }
        sc.close();
        System.out.println(ans);
    }
}