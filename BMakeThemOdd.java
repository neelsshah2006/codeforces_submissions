import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;

public class BMakeThemOdd {
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
            Integer[] tmp = new Integer[n];
            for (int i = 0; i < n; i++) {
                tmp[i] = fs.nextInt();
            }

            Arrays.sort(tmp, (a, b) -> Integer.compare(b, a));
            HashSet<Integer> st = new HashSet<>();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                while ((tmp[i] & 1) == 0 && !st.contains(tmp[i])) {
                    st.add(tmp[i]);
                    tmp[i] >>= 1;
                    cnt++;
                }
            }
            ans.append(cnt + "\n");
        }
        System.out.println(ans);
    }
}