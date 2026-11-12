import java.io.IOException;
import java.io.InputStream;

public class EAvalanche {
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
        while(t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            int[] inc = new int[n + 1];
            int factor = 0;
            int x = 0;
            for(int i = n; i > 0; i--) {
                factor = (factor + inc[i]) % 2;
                int moves = (a[i - 1] + factor) % 2;
                x = (x + moves) % 2;
                int l = Math.max(1, i - k);
                inc[i - 1] = (inc[i - 1] + moves) % 2;
                inc[l - 1] = (inc[l - 1] - moves + 2)  % 2;
            }
            ans.append(x == 1 ? "Alice\n" : "Bob\n");
        }
        System.out.print(ans);
    }
}