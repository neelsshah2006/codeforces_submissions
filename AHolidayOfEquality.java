import java.io.IOException;
import java.io.InputStream;

public class AHolidayOfEquality {
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
        int curr = fs.nextInt();
        int prev = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            prev = Math.max(prev, curr);
            curr = fs.nextInt();
            if (curr > prev) {
                ans += (curr - prev) * i;
            } else {
                ans += (prev - curr);
            }
        }
        System.out.println(ans);
    }
}