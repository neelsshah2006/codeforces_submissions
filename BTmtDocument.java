import java.util.Scanner;

public class BTmtDocument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int cnt_t = 0, cnt_m = 0;
            boolean ans = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'T') {
                    cnt_t++;
                } else {
                    cnt_t--;
                    cnt_m++;
                    if (cnt_t == -1) {
                        ans = false;
                        break;
                    }
                }
            }

            if (cnt_t != cnt_m)
                ans = false;

            if (ans == false) {
                sb.append("NO\n");
                continue;
            }

            cnt_t = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'T') {
                    cnt_t++;
                } else {
                    cnt_t--;
                    if (cnt_t == -1) {
                        ans = false;
                        break;
                    }
                }
            }

            if (cnt_t != cnt_m)
                ans = false;
            sb.append(ans ? "YES\n" : "NO\n");
        }
        sc.close();
        System.out.println(sb);
    }
}