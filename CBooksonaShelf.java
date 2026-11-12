import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class CBooksonaShelf {
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
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            Arrays.sort(a);
            int[] arr = new int[n];
            int l = 0, r = n - 1;
            int i = 0;
            while (l <= r) {
                if (l == r) {
                    arr[l] = a[i];
                    break;
                }

                arr[l] = a[i];
                arr[r] = a[i + 1];
                l++;
                r--;
                i += 2;
            }

            int vis = 1;
            int mx = 0;
            for (int x = 1; x < n; x++) {
                if (arr[x] > arr[mx]) {
                    vis++;
                    mx = x;
                }
            }

            int prev_mx = mx;
            mx = -1;
            for (int j = n - 1; j > prev_mx; j--) {
                if (arr[j] > mx) {
                    vis++;
                    mx = arr[j];
                }
            }
            ans.append(vis + "\n");
            for (int x : arr) {
                ans.append(x + " ");
            }
            ans.append("\n");
        }
        System.out.print(ans);
    }
}