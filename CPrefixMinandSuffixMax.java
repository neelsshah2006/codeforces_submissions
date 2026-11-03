import java.io.IOException;
import java.io.InputStream;

public class CPrefixMinandSuffixMax {
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
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
                sb.append("0");
            }

            int min = arr[0], max = arr[n - 1];
            sb.setCharAt(0, '1');
            sb.setCharAt(n - 1, '1');
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    sb.setCharAt(i, '1');
                }

                if (arr[n - i - 1] > max) {
                    max = arr[n - i - 1];
                    sb.setCharAt(n - i - 1, '1');
                }
            }
            sb.append("\n");
            ans.append(sb);
        }
        System.out.println(ans);
    }
}