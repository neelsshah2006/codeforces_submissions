import java.io.IOException;
import java.io.InputStream;

public class BEvenArray {
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
        StringBuilder sb = new StringBuilder();
        int n, a, b, tmp;
        while (t-- > 0) {
            n = fs.nextInt();
            a = 0;
            b = 0;
            for (int i = 0; i < n; i++) {
                tmp = fs.nextInt();
                if (tmp % 2 == 0 && i % 2 == 1)
                    a++;
                else if (tmp % 2 == 1 && i % 2 == 0)
                    b++;
            }

            if (a != b)
                sb.append("-1\n");
            else
                sb.append(a + "\n");
        }
        System.out.println(sb);
    }
}