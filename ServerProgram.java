import java.net.*;
import java.io.*;

class ServerProgram {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(4000);
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            String str = "Hello world";
            PrintStream ps = new PrintStream(os);
            ps.println(str);

            ps.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
