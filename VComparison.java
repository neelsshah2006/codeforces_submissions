import java.util.Scanner;

public class VComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        int b = sc.nextInt();
        sc.close();

        if ((c == '>' && a > b) || (c == '<' && a < b) || (c == '=' && a == b))
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }
}