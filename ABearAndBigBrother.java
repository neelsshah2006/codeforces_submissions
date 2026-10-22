import java.util.Scanner;

public class ABearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int count = 0;
        while (a <= b) {
            count++;
            a *= 3;
            b *= 2;
        }

        System.out.println(count);
    }
}