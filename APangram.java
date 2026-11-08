import java.util.HashSet;
import java.util.Scanner;

public class APangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        HashSet<Character> st = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c < 'a' || c > 'z') {
                c = (char) (c + 'a' - 'A');
            }
            st.add(c);
        }

        System.out.println(st.size() == 26 ? "YES" : "NO");
    }
}