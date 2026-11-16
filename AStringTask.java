import java.util.Scanner;

public class AStringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u' || c == 'i')
                continue;

            sb.append("." + c);
        }
        System.out.println(sb);
    }
}