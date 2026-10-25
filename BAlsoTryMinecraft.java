import java.io.IOException;
import java.io.InputStream;

public class BAlsoTryMinecraft {
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
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = fs.nextInt();
        }

        long[] left = new long[n];
        long[] right = new long[n];
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + Math.max(0, height[i - 1] - height[i]);
            right[n - i - 1] = right[n - i] + Math.max(0, height[n - i] - height[n - i - 1]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int s = fs.nextInt() - 1;
            int t = fs.nextInt() - 1;
            if (s < t)
                sb.append(left[t] - left[s]);
            else
                sb.append(right[t] - right[s]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}