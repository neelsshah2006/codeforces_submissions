import java.io.IOException;
import java.io.InputStream;

public class CInsertZeroandInvertPrefix {
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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            if (arr[n - 1] == 1) {
                ans.append("NO\n");
                continue;
            }

            int[] a = new int[n];
            int ones = 0;
            for (int i = 0; i < n; i++) {
                int x = arr[i];
                if (x == 1)
                    ones++;
                else {
                    a[i - ones] = ones;
                    ones = 0;
                }
            }

            ans.append("YES\n");
            for (int i = n - 1; i >= 0; i--) {
                ans.append(a[i] + " ");
            }
            ans.append("\n");
        }
        System.out.println(ans);
    }
}