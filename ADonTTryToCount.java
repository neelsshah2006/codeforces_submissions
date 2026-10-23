import java.util.Scanner;

public class ADonTTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            StringBuilder x = new StringBuilder(sc.next());
            String s = sc.next();

            int cnt = 0;
            while (x.indexOf(s) == -1 && cnt < 5) {
                x.append(x);
                cnt++;
            }

            if (x.indexOf(s) != -1)
                ans.append(cnt + "\n");
            else
                ans.append(-1 + "\n");
        }
        System.out.println(ans);
        sc.close();
    }
}