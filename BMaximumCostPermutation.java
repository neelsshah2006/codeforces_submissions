import java.io.IOException;
import java.io.InputStream;

public class BMaximumCostPermutation {
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
            int zeros = 0;
            int xr = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
                if (arr[i] == 0)
                    zeros++;
                xr ^= (i + 1) ^ arr[i];
            }

            int left = 0, right = n - 1;
            while (left <= right && arr[left] == left + 1)
                left++;
            while (right >= left && arr[right] == right + 1)
                right--;

            if (zeros == 0 || zeros > 1 || (arr[left] != 0 && arr[right] != 0)) {
                ans.append((right - left + 1) + "\n");
                continue;
            }

            if (arr[left] == 0 && left + 1 == xr) {
                left++;
                while (left <= right && arr[left] == left + 1)
                    left++;
            } else if (arr[right] == 0 && right + 1 == xr) {
                right--;
                while (right >= left && arr[right] == right + 1)
                    right--;
            }

            ans.append((right - left + 1) + "\n");
        }
        System.out.println(ans);
    }
}