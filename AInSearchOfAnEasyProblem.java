import java.util.Scanner;

public class AInSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr;
        boolean hard = false;
        for (int i = 0; i < n; i++) {
            curr = sc.nextInt();
            if (curr == 1)
                hard = true;
        }
        sc.close();
        System.out.println(hard == true ? "HARD" : "EASY");
    }
}