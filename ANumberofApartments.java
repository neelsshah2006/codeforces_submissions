import java.io.IOException;
import java.io.InputStream;

public class ANumberofApartments {
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
            if (n == 1 || n == 2 || n == 4) {
                ans.append("-1\n");
            } else if (n % 3 == 0) {
                ans.append((n / 3) + " 0 0\n");
            } else if (n % 3 == 1) {
                ans.append(((n - 7) / 3) + " 0 1\n");
            } else {
                ans.append(((n - 5) / 3) + " 1 0\n");
            }
        }
        System.out.println(ans);
    }
}