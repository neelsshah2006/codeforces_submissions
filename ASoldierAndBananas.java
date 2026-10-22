import java.util.Scanner;

public class ASoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, w;
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();
        sc.close();

        int sum = ((w * (w + 1)) * k) / 2;
        if (sum > n) {
            System.out.println(sum - n);
        } else {
            System.out.println(0);
        }
    }
}