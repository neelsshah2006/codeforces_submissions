import java.io.IOException;
import java.io.InputStream;

public class BMakeItUgly {
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
        int n, a0, tmp, len, min;
        while (t-- > 0) {
            n = fs.nextInt();
            a0 = fs.nextInt();
            len = 1;
            min = n;
            for (int i = 0; i < n - 1; i++) {
                tmp = fs.nextInt();
                if (tmp == a0) {
                    len++;
                } else {
                    min = Math.min(min, len);
                    len = 0;
                }
            }
            min = Math.min(min, len);
            ans.append((min == n ? "-1\n" : (min + "\n")));
        }
        System.out.println(ans);
    }
}