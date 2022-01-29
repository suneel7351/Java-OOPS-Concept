import java.io.*;
import java.net.*;

class WebServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(4000);
            Socket S = ss.accept();
            InputStream is = S.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str = br.readLine();
            System.out.println(str);
            ss.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
