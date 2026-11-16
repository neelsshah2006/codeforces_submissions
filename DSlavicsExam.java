import java.util.Scanner;

public class DSlavicsExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            String s = sc.next();
            String x = sc.next();
            int i = 0, j = 0;
            int n = s.length(), m = x.length();
            StringBuilder sb = new StringBuilder(s);
            while (i < n) {
                if (s.charAt(i) == x.charAt(j) || s.charAt(i) == '?') {
                    sb.setCharAt(i, x.charAt(j));
                    j++;
                }

                i++;
                if (j == m)
                    break;
            }

            while (i < n) {
                if (s.charAt(i) == '?')
                    sb.setCharAt(i, 'a');
                i++;
            }

            ans.append((j == m ? ("YES\n" + sb + "\n") : "NO\n"));
        }
        sc.close();
        System.out.print(ans);
    }
}