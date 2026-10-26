import java.util.Scanner;

public class CTargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            String[] str = new String[10];
            for (int i = 0; i < 10; i++) {
                str[i] = sc.next();
            }

            int points = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (str[i].charAt(j) != 'X') {
                        continue;
                    }
                    int layer = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j)) + 1;
                    points += layer;
                }
            }

            System.out.println(points);
        }
        sc.close();
    }
}