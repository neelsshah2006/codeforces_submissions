import java.util.Scanner;

public class AEvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();

        long half = (n + 1) / 2;
        long ans = 0;
        if (k > half) {
            ans = 2 * (k - half);
        } else {
            ans = 2 * k - 1;
        }

        System.out.println(ans);
    }
}