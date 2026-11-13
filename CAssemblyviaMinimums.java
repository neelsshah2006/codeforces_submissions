import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class CAssemblyviaMinimums {
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
            int x = n * (n - 1) / 2;
            int[] arr = new int[x];
            for (int i = 0; i < x; i++) {
                arr[i] = fs.nextInt();
            }

            Arrays.sort(arr);
            int i = 0, j = 0;
            while (j < x) {
                ans.append(arr[j] + " ");
                j += n - i - 1;
                i++;
            }
            ans.append(arr[j - 1] + "\n");
        }
        System.out.print(ans);
    }
}