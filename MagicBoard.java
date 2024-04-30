import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class MagicBoard {
    final long mod = (int) 1e9 + 7, IINF = (long) 1e19;
    final int MAX = (int) 1e6 + 1, MX = (int) 1e7 + 1, INF = (int) 1e9, root = 3;
    DecimalFormat df = new DecimalFormat("0.0000000000000");
    double eps = 1e-9, PI = 3.141592653589793238462643383279502884197169399375105820974944;
    static boolean multipleTC = true, memory = false;
    FastReader in;
    PrintWriter out;

    public static void main(String[] args) throws Exception {
        if (memory) new Thread(null, new Runnable() {
            public void run() {
                try {
                    new MagicBoard().run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 28).start();
        else new MagicBoard().run();
    }

    void run() throws Exception {
        System.out.println("Enter the input values one by one and press enter after every input:");
        in = new FastReader();
        out = new PrintWriter(System.out);
        for (int i = 1, T = (multipleTC) ? ni() : 1; i <= T; i++) solve(i);
        out.flush();
        out.close();
    }

    void solve(int TC) throws Exception {
        int n = ni(), m = ni();
        Queue<Integer>[] q = new Queue[MAX];
        for (int i = 1; i < MAX; i++) q[i] = new LinkedList<>();
        int[][] g = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = n();
            for (int j = 0; j < m; j++) {
                g[i][j] = s.charAt(j) - '0';
                if (g[i][j] > 0) q[g[i][j]].add(i * m + j);
            }
        }
        for (int i = 1; i < 10; i++) {
            if (q[i].isEmpty()) {
                pn(i);
                return;
            }
        }
        for (int num = 10; num < MAX; num++) {
            int x = num / 10;
            while (!q[x].isEmpty()) {
                int p = q[x].poll();
                int i = p / m, j = p % m;
                if (i < n - 1) q[x * 10 + g[i + 1][j]].add((i + 1) * m + j);
                if (i > 0) q[x * 10 + g[i - 1][j]].add((i - 1) * m + j);
                if (j > 0) q[x * 10 + g[i][j - 1]].add(i * m + j - 1);
                if (j < m - 1) q[x * 10 + g[i][j + 1]].add(i * m + j + 1);
            }
            if (q[num].isEmpty()) {
                pn(num);
                return;
            }
        }
    }

    void push(Queue<Integer>[] q, int[][] g, int x) {
        int n = g.length, m = g[0].length;

    }

    int lis(long[] a) {
        TreeMap<Long, Integer> map = new TreeMap<>();
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            int l = 0;
            if (map.isEmpty() || map.floorEntry(a[i]) == null) l = 1;
            else l = map.floorEntry(a[i]).getValue() + 1;
            Map.Entry<Long, Integer> e = null;
            while ((e = map.ceilingEntry(a[i])) != null && Integer.compare(e.getValue(), l) <= 0)
                map.remove(e.getKey());
            map.put(a[i], l);
            ans = Math.max(ans, l);
        }
        return ans;
    }

    int[] sort(int[] a) {
        if (a.length == 1) return a;
        int mid = a.length / 2;
        int[] b = sort(Arrays.copyOfRange(a, 0, mid)), c = sort(Arrays.copyOfRange(a, mid, a.length));
        for (int i = 0, j = 0, k = 0; i < a.length; i++) {
            if (j < b.length && k < c.length) {
                if (b[j] < c[k]) a[i] = b[j++];
                else a[i] = c[k++];
            } else if (j < b.length) a[i] = b[j++];
            else a[i] = c[k++];
        }
        return a;
    }

    long[] sort(long[] a) {
        if (a.length == 1) return a;
        int mid = a.length / 2;
        long[] b = sort(Arrays.copyOfRange(a, 0, mid)), c = sort(Arrays.copyOfRange(a, mid, a.length));
        for (int i = 0, j = 0, k = 0; i < a.length; i++) {
            if (j < b.length && k < c.length) {
                if (b[j] < c[k]) a[i] = b[j++];
                else a[i] = c[k++];
            } else if (j < b.length) a[i] = b[j++];
            else a[i] = c[k++];
        }
        return a;
    }

    long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    int bitcount(long n) {
        return (n == 0) ? 0 : (1 + bitcount(n & (n - 1)));
    }

    void p(Object o) {
        out.print(o);
    }

    void pn(Object o) {
        out.println(o);
    }

    void pni(Object o) {
        out.println(o);
        out.flush();
    }

    String n() {
        return in.next();
    }

    String nln() {
        return in.nextLine();
    }

    int ni() {
        return Integer.parseInt(in.next());
    }

    long nl() {
        return Long.parseLong(in.next());
    }

    double nd() {
        return Double.parseDouble(in.next());
    }

    class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception {
            br = new BufferedReader(new FileReader(s));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}