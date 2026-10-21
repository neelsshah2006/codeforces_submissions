import java.io.IOException;
import java.io.InputStream;

public class BSortTheSubarray {
    static class FastScanner {
        private final InputStream in = System.in;
        private byte[] buffer = new byte[1 << 16];
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
            } while (c < ' ');

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
            return sign * val;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            int n = fs.nextInt();
            int[] original = new int[n];
            for (int i = 0; i < n; i++) {
                original[i] = fs.nextInt();
            }

            int firstMismatch = -1, lastMismatch = -1;
            for (int i = 0; i < n; i++) {
                int curr = fs.nextInt();
                if (curr != original[i]) {
                    original[i] = curr;
                    if (firstMismatch == -1) {
                        firstMismatch = i;
                    }
                    lastMismatch = i;
                }
            }

            while (firstMismatch > 0 && original[firstMismatch] >= original[firstMismatch - 1]) {
                firstMismatch--;
            }
            firstMismatch++;

            while (lastMismatch < n - 1 && original[lastMismatch] <= original[lastMismatch + 1]) {
                lastMismatch++;
            }
            lastMismatch++;

            ans.append(firstMismatch + " " + lastMismatch + "\n");
        }
        System.out.print(ans);
    }
}