import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;

public class CYetAnotherPermutationProblem {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int len = 0, ptr = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0)
                    return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ' && c != -1);

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;
            while (c > ' ') {
                val = val * 10 + c - '0';
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            int n = fs.nextInt();
            HashSet<Integer> in = new HashSet<>();
            int i = 1, cnt = 0;
            while (cnt < n) {
                int key = i;
                while (key <= n) {
                    ans.append(key).append(" ");
                    in.add(key);
                    key *= 2;
                    cnt++;
                }
                while (in.contains(i))
                    i++;
            }
            ans.append("\n");
        }
        System.out.print(ans);
    }
}