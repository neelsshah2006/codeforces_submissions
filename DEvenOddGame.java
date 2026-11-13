import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class DEvenOddGame {
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
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            Arrays.sort(arr);
            long alice = 0, bob = 0;
            for (int i = n - 1; i >= 0; i--) {
                if ((n - i - 1) % 2 == 0 && arr[i] % 2 == 0) {
                    alice += arr[i];
                } else if ((n - i - 1) % 2 == 1 && arr[i] % 2 == 1) {
                    bob += arr[i];
                }
            }
            ans.append((alice == bob ? "Tie\n" : (alice > bob ? "Alice\n" : "Bob\n")));
        }
        System.out.print(ans);
    }
}