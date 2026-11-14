import java.io.IOException;
import java.io.InputStream;

public class CVeryEasyTask {
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
        int x = fs.nextInt();
        int y = fs.nextInt();

        int t = Math.min(x, y);
        int low = t;
        int high = t * n;
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long prints = 1L + (1L * (mid - t) / x) + (1L * (mid - t) / y);
            if (prints >= n) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        System.out.println(ans);
    }
}