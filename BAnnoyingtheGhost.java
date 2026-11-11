
import java.io.IOException;
import java.io.InputStream;
import java.util.TreeSet;

public class BAnnoyingtheGhost {
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
            int[] c = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            TreeSet<Integer> s = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                s.add(fs.nextInt());
            }

            boolean y = true;

            for (int i = 0; i < n; i++) {
                Integer val = s.ceiling(a[i]);

                if (val == null) {
                    y = false;
                    break;
                }

                c[i] = val;
                s.remove(val);
            }

            if (!y) {
                ans.append(-1).append('\n');
                continue;
            }

            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (c[i] > c[j]) {
                        count++;
                    }
                }
            }

            ans.append(count).append('\n');
        }

        System.out.print(ans);
    }
}
