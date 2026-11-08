import java.util.HashSet;
import java.util.Scanner;

public class BChatOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        HashSet<String> st = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            if (!st.contains(s[i])) {
                st.add(s[i]);
                ans.append(s[i] + "\n");
            }
        }
        System.out.println(ans);
    }
}