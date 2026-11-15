import java.io.IOException;
import java.io.InputStream;

public class BRudolfand121 {
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
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = fs.nextInt();

            boolean possible = true;
            for (int i = 0; i < n - 2; i++) {
                if (a[i] < 0) {
                    possible = false;
                    break;
                }
                a[i + 1] -= 2 * a[i];
                a[i + 2] -= a[i];
            }

            possible = possible && a[n - 2] == 0 && a[n - 1] == 0;
            ans.append(possible ? "YES\n" : "NO\n");
        }
        System.out.print(ans);
    }
}