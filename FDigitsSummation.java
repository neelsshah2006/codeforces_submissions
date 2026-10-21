import java.util.Scanner;

public class FDigitsSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        System.out.println(a % 10 + b % 10);
    }
}