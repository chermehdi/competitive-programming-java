package tutorial01_io;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintWriterExample {

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        out.println("hello");
        out.println(123);
        out.printf("%d, %d", 23, 34);

        out.flush(); // if you want to force the output use flush
        out.close(); // don't forget to close the PrintWriter
    }

}
