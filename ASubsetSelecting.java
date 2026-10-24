import java.io.IOException;
import java.io.InputStream;

public class ASubsetSelecting {
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
        int n, k, tmp, less;
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            n = fs.nextInt();
            k = fs.nextInt();
            int[] freq = new int[n + 1];
            for (int i = 0; i < n; i++) {
                tmp = fs.nextInt();
                freq[tmp]++;
            }

            less = 0;
            int i = 0;
            for (; freq[i] != 0 && freq[i] + less >= k; i++) {
                less += freq[i] - k;
            }
            ans.append(i + "\n");
        }
        System.out.println(ans);
    }
}