import java.util.Scanner;

public class ACatchTheCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y >= -1)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        sc.close();
        System.out.print(sb);
    }
}