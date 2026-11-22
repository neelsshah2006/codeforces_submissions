import java.io.IOException;
import java.io.InputStream;

public class BBoboniuPlaysChess {
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
        StringBuilder ans = new StringBuilder();
        int n = fs.nextInt();
        int m = fs.nextInt();
        int sx = fs.nextInt();
        int sy = fs.nextInt();

        ans.append(sx).append(' ').append(sy).append('\n');

        int prev = sy;

        for (int j = 1; j <= m; j++) {
            if (j != sy) {
                ans.append(sx).append(' ').append(j).append('\n');
                prev = j;
            }
        }

        int nxtPrev = prev;

        for (int i = 1; i <= n; i++) {
            if (i == sx)
                continue;

            ans.append(i).append(' ').append(prev).append('\n');

            for (int j = 1; j <= m; j++) {
                if (j != prev) {
                    ans.append(i).append(' ').append(j).append('\n');
                    nxtPrev = j;
                }
            }

            prev = nxtPrev;
        }
        System.out.println(ans);
    }
}