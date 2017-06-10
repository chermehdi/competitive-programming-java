package tutorial01_io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String args) throws FileNotFoundException {
        InputStream is = System.in;
        FileInputStream fis = new FileInputStream("path");
        Scanner in = new Scanner(is);
        //Scanner in = new Scanner(fis); // to read from the file with the given path

        int a = in.nextInt();
        double b = in.nextDouble();
        long c = in.nextLong();
        String d = in.next();
        String line = in.nextLine();

        while (in.hasNextLine()) {
            String currline = in.nextLine();
            //reading until the end-of-file
        }

        in.close(); // always close your resources it's good practice
    }
}
