//This program is done by Ronak Bhalgami(21CE009)
import java.io.*;
public class PR2_1 {
    public static void main(String[] args) throws IOException {
        FileReader source = null;
        try {
            source = new
                    FileReader("D:\\STUDY\\JAVA practical\\Practice set 5 - File Handling & Streams\\1.txt");
            int temp;
            while ((temp = source.read()) != -1)
                System.out.println((char) temp);
        }
        finally {
            if (source != null)
                source.close();
        }
    }
}
