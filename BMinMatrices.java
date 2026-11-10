import java.io.IOException;
import java.io.InputStream;

public class BMinMatrices {
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
            int k = fs.nextInt();
            if (k < n || k >= 2 * n) {
                ans.append("-1\n");
                continue;
            }
            int[][] arr = new int[n][n];
            int start = k - n + 1;
            for (int i = 0; i < n; i++) {
                arr[i][i] = start++;
            }

            int n2 = n * n;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        ans.append(arr[i][j] + " ");
                        continue;
                    }

                    arr[i][j] = start;
                    start = (start % n2) + 1;
                    ans.append(arr[i][j] + " ");
                }
                ans.append("\n");
            }
        }
        System.out.print(ans);
    }
}