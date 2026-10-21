import java.io.IOException;
import java.io.InputStream;

public class ALineTrip {
    static class FastScanner {
        private final InputStream in = System.in;
        private byte[] buffer = new byte[1 << 16];
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
            } while (c < ' ');

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
            return sign * val;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = fs.nextInt();
            int x = fs.nextInt();
            int prev = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                int curr = fs.nextInt();
                max = Math.max(curr - prev, max);
                prev = curr;
            }
            max = Math.max(max, 2 * (x - prev));

            sb.append(max + "\n");
        }
        System.out.print(sb);
    }
}
