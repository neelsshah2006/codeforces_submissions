import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BApplemanandCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        sc.close();

        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (Map.Entry<Character, Integer> e : mp.entrySet()) {
            arr.add(e.getValue());
        }
        Collections.sort(arr, (a, b) -> Integer.compare(b, a));

        long ans = 0;
        for (int i = 0; i < arr.size() && k > 0; i++) {
            int take = Math.min(arr.get(i), k);
            ans += (long) take * take;
            k -= take;
        }
        System.out.println(ans);
    }
}