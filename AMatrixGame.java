import java.io.IOException;
import java.io.InputStream;

public class AMatrixGame {
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
            int n = fs.nextInt();
            int m = fs.nextInt();
            int tmp;
            boolean[] rows = new boolean[n];
            boolean[] cols = new boolean[m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    tmp = fs.nextInt();
                    if (tmp == 1) {
                        rows[i] = true;
                        cols[j] = true;
                    }
                }
            }

            int freeRows = 0;
            for (int i = 0; i < n; i++)
                if (!rows[i])
                    freeRows++;

            int freeCols = 0;
            for (int i = 0; i < m; i++)
                if (!cols[i])
                    freeCols++;

            ans.append(Math.min(freeCols, freeRows) % 2 == 0 ? "Vivek\n" : "Ashish\n");
        }
        System.out.print(ans);
    }
}