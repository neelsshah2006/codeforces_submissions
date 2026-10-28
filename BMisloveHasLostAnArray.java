import java.util.Scanner;

public class BMisloveHasLostAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        int min = (1 << l) + n - l - 1;
        int max = (1 << r) + ((1 << (r - 1)) * (n - r)) - 1;
        System.out.println(min + " " + max);
    }
}