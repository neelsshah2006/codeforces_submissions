import java.util.Scanner;

public class ACoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        testCase: while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int empty = 0;
            int actionCount = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '#') {
                    if (empty == 1)
                        actionCount++;
                    else if (empty == 2)
                        actionCount += 2;
                    empty = 0;
                } else {
                    empty++;
                    if(empty == 3) {
                        sb.append(2 + "\n");
                        continue testCase;
                    }
                }
            }

            if (empty == 1)
                actionCount++;
            else if (empty >= 2)
                actionCount += 2;

            sb.append(actionCount + "\n");
        }
        sc.close();
        System.out.print(sb);
    }
}