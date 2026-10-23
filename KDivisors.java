import java.util.Scanner;

public class KDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        int max = n / 2 + 1;
        for (int i = 1; i < max; i++) {
            if (n % i == 0)
                sb.append(i + "\n");
        }
        sb.append(n);
        System.out.println(sb);
    }
}