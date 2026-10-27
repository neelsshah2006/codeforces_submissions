import java.io.IOException;
import java.io.InputStream;

public class DOddQueries {
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
        int n, q, l, r, num;
        long s;
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            n = fs.nextInt();
            q = fs.nextInt();
            long[] sum = new long[n + 1];
            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + fs.nextInt();
            }

            for (int i = 0; i < q; i++) {
                l = fs.nextInt() - 1;
                r = fs.nextInt() - 1;
                num = fs.nextInt();
                s = sum[n] - sum[r + 1] + sum[l] + ((long) num * (r - l + 1));
                ans.append((s % 2) != 0 ? "YES\n" : "NO\n");
            }
        }
        System.out.println(ans);
    }
}