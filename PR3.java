//This program is done by Ronak Bhalgami(21CE009)
import java.io.*;
public class PR3 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\STUDY\\JAVA practical\\Practice set 5 - File Handling & Streams\\1.txt");
            out = new FileOutputStream("D:\\STUDY\\JAVA practical\\Practice set 5 - File Handling & Streams\\2.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        catch(IOException ie) {
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}