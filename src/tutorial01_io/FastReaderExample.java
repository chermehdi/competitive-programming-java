package tutorial01_io;


import java.io.*;
import java.util.StringTokenizer;

public class FastReaderExample {


    public static void main(String args) throws FileNotFoundException {
        InputStream is = System.in;
        FileInputStream fis = new FileInputStream("path");
        FastReader in = new FastReader(is);
        //FastReader in = new FastReader(fis);  to read from the file with the given path

        int a = in.nextInt();
        double b = in.nextDouble();
        long c = in.nextLong();
        String d = in.next();
        String line = in.nextLine();

        String curLine = null;
        while ((curLine = in.nextLine()) != null) {
            String currline = in.nextLine();
            //reading until the end-of-file
        }

        in.close(); // always close your resources it's good practice
    }

    static class FastReader {
        BufferedReader in = null;
        StringTokenizer st;

        public FastReader() {
        }

        public FastReader(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(in.readLine());
                }
            } catch (Exception e) {
                return null;
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return in.readLine();
            } catch (IOException e) {
            }
            return null;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
            }
        }
    }
}
