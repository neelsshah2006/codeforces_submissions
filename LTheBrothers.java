import java.util.Scanner;

public class LTheBrothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f1 = sc.next();
        String l1 = sc.next();
        String f2 = sc.next();
        String l2 = sc.next();
        sc.close();

        System.out.println(l1.equals(l2) ? "ARE Brothers" : "NOT");
    }
}