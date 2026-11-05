import java.util.HashMap;
import java.util.Scanner;

public class B1CharacterSwapEasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            HashMap<Character, Character> chars = new HashMap<>();
            HashMap<Character, Integer> count = new HashMap<>();
            boolean ans = true;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    chars.putIfAbsent(a.charAt(i), b.charAt(i));

                    if (chars.get(a.charAt(i)) == b.charAt(i)) {
                        count.put(a.charAt(i), count.getOrDefault(a.charAt(i), 0) + 1);
                    } else {
                        ans = false;
                        break;
                    }
                }
            }

            if (ans && chars.size() == 1 && count.get(chars.keySet().iterator().next()) == 2) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        sc.close();
        System.out.println(sb);
    }
}