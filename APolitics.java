import java.util.Scanner;

public class APolitics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String match = sc.next();
            String curr;
            int cnt = 1;
            for (int i = 1; i < n; i++) {
                curr = sc.next();
                if (match.equals(curr))
                    cnt++;
            }
            sb.append(cnt + "\n");
        }
        System.out.print(sb);
        sc.close();
    }
}