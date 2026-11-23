import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class CGorillaandPermutation {
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
        StringBuilder sb = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            int k = fs.nextInt();

            for (int x = n; x >= k; x--)
                sb.append(x).append(' ');

            for (int x = m + 1; x < k; x++)
                sb.append(x).append(' ');

            for (int x = 1; x <= m; x++)
                sb.append(x).append(' ');

            sb.append('\n');
        }

        PrintWriter out = new PrintWriter(System.out);
        out.print(sb);
        out.flush();
    }
}