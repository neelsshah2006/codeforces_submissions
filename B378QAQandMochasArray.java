import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;

public class B378QAQandMochasArray {
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
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            Arrays.sort(a);
            HashSet<Integer> st = new HashSet<>();
            int size = n - 1;
            int next = -1;
            for (int i = 1; i < n; i++) {
                if (a[i] % a[0] == 0) {
                    size--;
                    st.add(i);
                } else if (next == -1) {
                    next = i;
                }
            }

            if (next == -1) {
                ans.append("Yes\n");
                continue;
            }

            size--;
            for (int i = next + 1; i < n; i++) {
                if (!st.contains(i) && a[i] % a[next] == 0) {
                    size--;
                }
            }

            ans.append(size == 0 ? "Yes\n" : "No\n");
        }
        System.out.print(ans);
    }
}