import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;

public class BThreeSevens {
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
        outer: while (t-- > 0) {
            int m = fs.nextInt();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int ni = fs.nextInt();
                ArrayList<Integer> l = new ArrayList<>();
                for (int j = 0; j < ni; j++) {
                    l.add(fs.nextInt());
                }
                list.add(l);
            }

            HashSet<Integer> set = new HashSet<>();
            int[] res = new int[m];

            for (int i = m - 1; i >= 0; i--) {
                ArrayList<Integer> l = list.get(i);
                boolean added = false;

                for (int num : l) {
                    if (!set.contains(num)) {
                        res[i] = num;
                        added = true;
                        break;
                    }
                }

                if (!added) {
                    ans.append("-1\n");
                    continue outer;
                }

                set.addAll(l);
            }

            for (int i = 0; i < m; i++) {
                if (i > 0)
                    ans.append(" ");
                ans.append(res[i]);
            }
            ans.append("\n");
        }

        System.out.print(ans);
    }
}