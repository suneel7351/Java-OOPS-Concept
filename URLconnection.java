import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.lang.reflect.WildcardType;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class URLconnection {

        public static void main(String args[]) throws Exception {
                try {
                        FileOutputStream fos = new FileOutputStream("web.html");
                        URL url = new URL("http://www.csjmu.ac.in");
                        URLConnection connection = url.openConnection();
                        InputStream is = connection.getInputStream();
                        int data;
                        while ((data = is.read()) != -1) {
                                fos.write(data);
                        }
                } catch (Exception e) {
                        // TODO: handle exception
                }

        }
}