import java.io.IOException;
import java.io.InputStream;

public class BMakeItIncreasing {
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
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            int i = n - 2;
            int ops = 0;
            while (i >= 0) {
                if (a[i + 1] == 0)
                    break;
                while (a[i] >= a[i + 1]) {
                    ops++;
                    a[i] /= 2;
                }
                i--;
            }
            ans.append(i != -1 ? "-1\n" : ops + "\n");
        }
        System.out.print(ans);
    }
}