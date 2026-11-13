import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class BPlayinginaCasino {
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
            int[][] arr = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[j][i] = fs.nextInt();
                }
            }

            long a = 0;
            for (int i = 0; i < m; i++) {
                Arrays.sort(arr[i]);
                for (int j = n - 1; j >= 0; j--) {
                    a += 1L * j * arr[i][j] - 1L * (n - j - 1) * arr[i][j];
                }
            }
            ans.append(a + "\n");
        }
        System.out.print(ans);
    }
}