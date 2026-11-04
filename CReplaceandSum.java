import java.io.IOException;
import java.io.InputStream;

public class CReplaceandSum {
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
        while (t-- > 0) {
            int n = fs.nextInt();
            int q = fs.nextInt();

            int[] a = new int[n + 2];
            int[] b = new int[n + 2];
            long[] dp = new long[n + 2];
            long[] pref = new long[n + 2];

            for (int i = 1; i <= n; i++)
                a[i] = fs.nextInt();
            for (int i = 1; i <= n; i++)
                b[i] = fs.nextInt();

            dp[n] = Math.max(a[n], b[n]);
            for (int i = n - 1; i >= 1; i--) {
                dp[i] = Math.max(a[i], Math.max(b[i], dp[i + 1]));
            }

            for (int i = 1; i <= n; i++) {
                pref[i] = pref[i - 1] + dp[i];
            }

            while (q-- > 0) {
                int l = fs.nextInt();
                int r = fs.nextInt();
                long ans = pref[r] - pref[l - 1];
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}