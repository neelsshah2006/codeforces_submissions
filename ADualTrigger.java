import java.util.Scanner;

public class ADualTrigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean adj = false;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    cnt++;
                    if (!adj && i > 0 && s.charAt(i - 1) == '1') {
                        adj = true;
                    }
                }
            }

            if (cnt % 2 != 0 || (cnt == 2 && adj)) {
                ans.append("NO\n");
            } else {
                ans.append("YES\n");
            }
        }
        sc.close();
        System.out.println(ans);
    }
}