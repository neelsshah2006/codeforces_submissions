import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class ATeamOlympiad {
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
        int tmp;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        map.put(1, new ArrayList<>());
        map.put(2, new ArrayList<>());
        map.put(3, new ArrayList<>());
        for (int i = 1; i <= n; i++) {
            tmp = fs.nextInt();
            ArrayList<Integer> l = map.get(tmp);
            l.add(i);
        }

        StringBuilder sb = new StringBuilder();
        int len = Math.min(map.get(1).size(), Math.min(map.get(2).size(), map.get(3).size()));
        sb.append(len + "\n");
        for (int i = 0; i < len; i++) {
            sb.append(map.get(1).get(i) + " " + map.get(2).get(i) + " " + map.get(3).get(i) + "\n");
        }
        System.out.println(sb);
    }
}