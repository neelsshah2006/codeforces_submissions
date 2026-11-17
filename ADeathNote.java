import java.io.IOException;
import java.io.InputStream;

public class ADeathNote {
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
        int n = fs.nextInt();
        int m = fs.nextInt();
        int prev = 0;
        int curr;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            curr = fs.nextInt();
            int c = (curr >= prev ? (prev == 0 ? 0 : 1) + (curr - prev) / m : 0);
            ans.append(c + " ");
            prev = (curr >= prev ? m - (curr - prev) % m : prev - curr);
        }
        System.out.println(ans);
    }
}