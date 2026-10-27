import java.util.Scanner;

public class AAntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        int a = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A')
                a++;
        }

        int d = n - a;
        if (a > d) {
            System.out.println("Anton");
        } else if (a == d) {
            System.out.println("Friendship");
        } else {
            System.out.println("Danik");
        }
    }
}