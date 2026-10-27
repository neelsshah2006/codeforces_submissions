import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ADragons {
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
        int s = fs.nextInt();
        int n = fs.nextInt();
        ArrayList<Integer>[] dragons = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            dragons[i] = new ArrayList<>();
            dragons[i].add(fs.nextInt());
            dragons[i].add(fs.nextInt());
        }

        Arrays.sort(dragons, (a, b) -> a.get(0) == b.get(0) ? Integer.compare(b.get(1), a.get(1))
                : Integer.compare(a.get(0), b.get(0)));
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            if (s <= dragons[i].get(0)) {
                ans = false;
                break;
            }
            s += dragons[i].get(1);
        }
        System.out.println(ans ? "YES" : "NO");
    }
}