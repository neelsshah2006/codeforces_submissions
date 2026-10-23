import java.util.Scanner;

public class ALuckyYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int tmp = n;
        int cnt = 0, msb = 0;
        while(tmp > 0) {
            msb = tmp % 10;
            tmp /= 10;
            cnt++;
        }
        int dest = (int) ((msb + 1) * Math.pow(10, cnt - 1));
        System.out.println(dest - n);
    }
}