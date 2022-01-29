import java.io.*;
import java.net.*;

class KanpurUniversity {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket();
        OutputStream os = s.getOutputStream();
        OutputStream out = new FileOutputStream("/home/suneel/Desktop/Data/index.html");

        URL url = new URL("http://csjmu.ac.in/index.html");
        URLConnection conn = url.openConnection();
        conn.connect();
        InputStream is = conn.getInputStream();

        copy(is, out);
        is.close();
        out.close();
    }

    private static void copy(InputStream from, OutputStream to) throws IOException {
        byte[] buffer = new byte[4096];
        while (true) {
            int numBytes = from.read(buffer);
            if (numBytes == -1) {
                break;
            }
            to.write(buffer, 0, numBytes);
        }
    }
}