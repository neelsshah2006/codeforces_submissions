import java.io.IOException;
import java.io.InputStream;

public class AThreePiles {
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
            int a = fs.nextInt();
            int b = fs.nextInt();
            int c = fs.nextInt();
            int min = Math.min(a, Math.min(b, c));
            int max = Math.max(a, Math.max(b, c));
            int mid = min ^ max ^ a ^ b ^ c;
            if (max - mid == 1 && mid - min == 1) {
                ans.append("YES\n");
            } else {
                ans.append("NO\n");
            }
        }
        System.out.print(ans);
    }
}