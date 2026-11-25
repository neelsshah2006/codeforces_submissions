import java.io.IOException;
import java.io.InputStream;

public class CFlowerCityFence {
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
            boolean np = true;
            int[] a = new int[n];
            int[] freq = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
                if (a[i] > n) {
                    np = false;
                } else
                    freq[a[i]]++;
            }

            if (!np) {
                ans.append("NO\n");
                continue;
            }

            for (int i = n - 1; i >= 0; i--) {
                freq[i] += freq[i + 1];
            }

            for (int i = 0; i < n; i++) {
                if (freq[i + 1] != a[i]) {
                    np = false;
                    break;
                }
            }

            ans.append((np ? "YES\n" : "NO\n"));
        }
        System.out.print(ans);
    }
}