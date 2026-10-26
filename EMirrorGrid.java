import java.util.Scanner;

public class EMirrorGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }

            int ops = 0;
            int h = n / 2;
            int h1 = (n % 2 == 0 ? h : h + 1);
            int pos1, pos2, pos3, pos4, sum;
            for (int i = 0; i < h1; i++) {
                for (int j = 0; j < h; j++) {
                    pos1 = arr[i].charAt(j) - '0';
                    pos2 = arr[j].charAt(n - i - 1) - '0';
                    pos3 = arr[n - j - 1].charAt(i) - '0';
                    pos4 = arr[n - i - 1].charAt(n - j - 1) - '0';

                    sum = pos1 + pos2 + pos3 + pos4;
                    ops += Math.min(sum, 4 - sum);
                }
            }
            ans.append(ops + "\n");
        }
        sc.close();
        System.out.println(ans);
    }
}