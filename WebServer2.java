import java.io.*;
import java.net.*;

class WebServer2 {
    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(4000);
            Socket S = ss.accept();
            InputStream is = S.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str = br.readLine();
            String s1 = "";
            int i = 1;
            while (i < 5) {
                s1 = s1 + str + "<br/>";
                str = br.readLine();
                i++;
            }
            FileInputStream fis = new FileInputStream("/home/suneel/Desktop/Data/index.html");
            byte b[] = new byte[fis.available()];
            fis.read(b);
            OutputStream os = S.getOutputStream();
            os.write(("HTTP/1.1 200 OK\r\n").getBytes());
            os.write(("Content-type:text/html\r\n").getBytes());
            os.write(("Content-length:+ " + s1.length() + " \r\n").getBytes());
            os.write(("\r\n").getBytes());
            os.write(b);
            os.flush();
            S.close();
        } catch (Exception e) {

        }
    }
}