import java.util.Scanner;

public class BStubbornPen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int manual = 0;
            boolean red = true;
            for (int i = 0; i < n; i++) {
                if ((red && s.charAt(i) == 'B') || (!red && s.charAt(i) == 'R')) {
                    manual++;
                } else {
                    red = !red;
                }
            }
            ans.append(manual + "\n");
        }
        sc.close();
        System.out.print(ans);
    }
}