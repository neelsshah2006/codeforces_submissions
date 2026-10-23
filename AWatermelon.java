import java.util.Scanner;

public class AWatermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n >= 4 && n % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}