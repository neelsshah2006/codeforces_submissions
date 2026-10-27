import java.util.Scanner;

public class ABoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int n = s.length();
        boolean[] used = new boolean[26];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (used[s.charAt(i) - 'a']) {
                continue;
            }
            used[s.charAt(i) - 'a'] = true;
            count++;
        }

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}