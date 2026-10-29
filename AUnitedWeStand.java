import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AUnitedWeStand {
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
            TreeMap<Integer, Integer> mp = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int tmp = fs.nextInt();
                mp.put(tmp, mp.getOrDefault(tmp, 0) + 1);
            }

            int els = mp.size();
            if (els <= 1) {
                ans.append(-1);
                ans.append("\n");
                continue;
            }

            Iterator<Map.Entry<Integer, Integer>> it = mp.entrySet().iterator();
            StringBuilder sb = new StringBuilder();
            int a = 0;
            for (int i = 0; i < els / 2; i++) {
                Map.Entry<Integer, Integer> e = it.next();
                int k = e.getKey();
                int v = e.getValue();
                a += v;
                sb.append((k + " ").repeat(v));
            }

            sb.append("\n");
            int b = 0;
            while (it.hasNext()) {
                Map.Entry<Integer, Integer> e = it.next();
                int k = e.getKey();
                int v = e.getValue();
                b += v;
                sb.append((k + " ").repeat(v));
            }
            sb.append('\n');

            ans.append(a + " " + b + "\n");
            ans.append(sb);
        }

        System.out.println(ans);
    }
}