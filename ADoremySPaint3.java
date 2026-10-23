import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ADoremySPaint3 {
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
        while (t-- > 0) {
            int n = fs.nextInt();
            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = fs.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }

            boolean ans = false;
            if (mp.size() == 1)
                ans = true;
            else if (mp.size() == 2) {
                boolean tmp = true;
                for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
                    if (e.getValue() != n / 2 && e.getValue() != n - n / 2) {
                        tmp = false;
                        break;
                    }
                }
                ans = tmp;
            }

            System.out.println(ans ? "Yes" : "No");
        }
    }
}