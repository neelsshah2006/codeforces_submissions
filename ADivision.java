import java.io.IOException;
import java.io.InputStream;

public class ADivision {
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
        while (t-- > 0) {
            int rating = fs.nextInt();
            StringBuilder sb = new StringBuilder("Division ");

            if (rating <= 1399) {
                sb.append('4');
            } else if (rating <= 1599) {
                sb.append('3');
            } else if (rating <= 1899) {
                sb.append('2');
            } else {
                sb.append('1');
            }

            System.out.println(sb);
        }
    }
}