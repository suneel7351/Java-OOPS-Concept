import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.43.255", 4000);
            System.out.println("connected");
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String st = br.readLine();
            System.out.println(st);
            s.close();
        } catch (Exception e) {
            // TODO: handle exceptionf
        }
    }
}
