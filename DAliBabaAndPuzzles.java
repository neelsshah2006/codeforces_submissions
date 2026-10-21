import java.util.Scanner;

public class DAliBabaAndPuzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        sc.close();

        long as = a + b - c, am = a + b * c;
        long sa = a - b + c, sm = a - b * c;
        long ma = a * b + c, ms = a * b - c;
        if (as == d || am == d || sa == d || sm == d || ma == d || ms == d)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}