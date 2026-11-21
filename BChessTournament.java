import java.util.ArrayList;
import java.util.Scanner;

public class BChessTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Integer> players = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '2') {
                    players.add(i);
                }
            }

            int cnt = players.size();
            if (cnt == 1 || cnt == 2) {
                ans.append("NO\n");
                continue;
            }

            ArrayList<ArrayList<Character>> a = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                ArrayList<Character> row = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    row.add('=');
                }
                row.set(i, 'X');
                a.add(row);
            }

            if (cnt >= 3) {
                for (int i = 0; i < cnt; i++) {
                    int u = players.get(i);
                    int v = players.get((i + 1) % cnt);
                    a.get(u).set(v, '+');
                    a.get(v).set(u, '-');
                }
            }

            ans.append("YES\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans.append(a.get(i).get(j));
                }
                ans.append('\n');
            }
        }
        sc.close();
        System.out.print(ans);
    }
}