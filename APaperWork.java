import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class APaperWork {
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
        int[] a = new int[n];
        ArrayList<Integer> folders = new ArrayList<>();
        int size = 0, negs = 0;
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
            if (a[i] < 0) {
                negs++;
            }

            if (negs == 3) {
                folders.add(size);
                size = 1;
                negs = 1;
            } else
                size++;
        }

        if (size > 0) {
            folders.add(size);
        }

        StringBuilder ans = new StringBuilder();
        ans.append(folders.size() + "\n");
        for (int x : folders) {
            ans.append(x + " ");
        }
        System.out.println(ans);
    }
}