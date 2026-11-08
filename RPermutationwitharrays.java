import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class RPermutationwitharrays {
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
        int n = fs.nextInt();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int t = fs.nextInt();
            mp.put(t, mp.getOrDefault(t, 0) + 1);
        }

        boolean ans = true;
        for (int i = 0; i < n; i++) {
            int t = fs.nextInt();
            int x = mp.getOrDefault(t, -1);
            if (x == -1) {
                ans = false;
                break;
            }

            if (x == 1)
                mp.remove(t);
            else
                mp.put(t, x - 1);
        }
        System.out.println((ans == true && mp.size() == 0) ? "yes" : "no");
    }
}