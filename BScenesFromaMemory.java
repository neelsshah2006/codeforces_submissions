import java.util.Arrays;
import java.util.Scanner;

public class BScenesFromaMemory {
    static final int N = 100;
    static boolean[] isPrime = new boolean[N + 1];

    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            int k = sc.nextInt();
            String n = sc.next();
            boolean a = false;
            int val = 0;

            for (int i = 0; i < k && !a; i++) {
                if (isPrime[n.charAt(i) - '0'] == false) {
                    a = true;
                    val = n.charAt(i) - '0';
                }
            }

            if (a == true) {
                ans.append(1 + "\n" + val + "\n");
                continue;
            }

            for (int i = 0; i < k && !a; i++) {
                for (int j = i + 1; j < k && !a; j++) {
                    int x = (n.charAt(i) - '0') * 10 + n.charAt(j) - '0';
                    if (isPrime[x] == false) {
                        a = true;
                        val = x;
                    }
                }
            }

            ans.append(2 + "\n" + val + "\n");
        }
        sc.close();
        System.out.println(ans);
    }
}