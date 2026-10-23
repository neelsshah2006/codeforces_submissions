import java.util.Scanner;

public class CEvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0, pos = 0, neg = 0;
        for(int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            if (curr > 0)
                pos++;
            else if (curr < 0)
                neg++;

            if (curr % 2 == 0)
                even++;
        }
        sc.close();

        System.out.println("Even: " + even + "\nOdd: " + (n - even) + "\nPositive: " + pos + "\nNegative: " + neg);
    }
}