import java.io.IOException;
import java.io.InputStream;

public class BLauraAndOperations {
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
        int a, b, c, ab, bc, ac;
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            a = fs.nextInt();
            b = fs.nextInt();
            c = fs.nextInt();
            ab = a + b;
            bc = b + c;
            ac = a + c;

            if (bc % 2 == 0)
                ans.append("1 ");
            else
                ans.append("0 ");

            if (ac % 2 == 0)
                ans.append("1 ");
            else
                ans.append("0 ");

            if (ab % 2 == 0)
                ans.append("1\n");
            else
                ans.append("0\n");
        }
        System.out.println(ans);
    }
}