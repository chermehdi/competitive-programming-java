package tutorial01_io;


import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputReaderExample {

    public static void main(String args) throws FileNotFoundException {
        InputStream is = System.in;
        InputReader in = new InputReader(is);

        int a = in.nextInt();
        double b = in.nextDouble();
        long c = in.nextLong();
        String d = in.next();
        String line = in.nextLine();

    }
}
