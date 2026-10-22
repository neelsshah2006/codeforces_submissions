import java.io.IOException;
import java.io.InputStream;

public class CAlternatingSubsequence {
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
            int curr = fs.nextInt();
            int best = curr;
            long sum = 0;
            boolean neg = curr < 0;

            for (int i = 1; i < n; i++) {
                curr = fs.nextInt();
                if ((curr < 0) == neg) {
                    best = Math.max(curr, best);
                } else {
                    sum += best;
                    neg = !neg;
                    best = curr;
                }
            }
            sum += best;
            sb.append(sum + "\n");
        }
        System.out.print(sb);
    }
}