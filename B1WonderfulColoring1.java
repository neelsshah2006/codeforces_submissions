import java.util.HashMap;
import java.util.Scanner;

public class B1WonderfulColoring1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            String s = sc.next();
            int a = s.length();
            HashMap<Character, Integer> mp = new HashMap<>();
            for (char c : s.toCharArray()) {
                int x = mp.getOrDefault(c, 0);
                if (x >= 2) {
                    a--;
                }
                mp.put(c, x + 1);
            }
            ans.append((a / 2) + "\n");
        }
        sc.close();
        System.out.println(ans);
    }
}