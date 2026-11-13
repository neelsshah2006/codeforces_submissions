import java.io.IOException;
import java.io.InputStream;

public class IParkingLot {
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

    public static long binExp(long a, int b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res *= a;
            a *= a;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();

        if (n == 3) {
            System.out.println("24");
            return;
        }

        long total = (36L * n - 12) * binExp(4, n - 4);
        System.out.println(total);
    }
}