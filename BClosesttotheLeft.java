import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class BClosesttotheLeft {
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
        int q = fs.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = fs.nextInt();
            arr[i][1] = i + 1;
        }

        Arrays.sort(arr, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        StringBuilder ans = new StringBuilder();
        while (q-- > 0) {
            int k = fs.nextInt();
            int low = 0, high = n - 1;
            int a = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid][0] <= k) {
                    a = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            ans.append((a == -1 ? 0 : arr[a][1]) + "\n");
        }
        System.out.println(ans);
    }
}