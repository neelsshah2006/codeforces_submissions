import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class AEhabFailstoBeThanos {
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
        int x = fs.nextInt();
        int n = x * 2;
        int[] arr = new int[n];
        boolean allSame = true;
        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
            if (arr[i] != arr[0])
                allSame = false;
        }

        if (allSame) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(arr);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans.append(arr[i] + " ");
        }
        System.out.println(ans);
    }
}