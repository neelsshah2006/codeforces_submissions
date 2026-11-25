import java.util.HashSet;
import java.util.Scanner;

public class ASuperheroTransformation {
    static HashSet<Character> st = new HashSet<>();
    static {
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        if (s.length() != t.length()) {
            System.out.println("No\n");
            return;
        }

        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (st.contains(s.charAt(i)) ^ st.contains(t.charAt(i))) {
                System.out.println("No\n");
                return;
            }
        }
        System.out.println("Yes\n");
    }
}