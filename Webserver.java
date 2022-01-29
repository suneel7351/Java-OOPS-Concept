import java.io.*;
import java.net.*;

class Webserver extends Thread {
    Socket s1 = null;

    Webserver(Socket p) {
        s1 = p;
    }

    public static void main(String ar[]) throws Exception {

        ServerSocket ss = new ServerSocket(4000);
        while (true) {
            Socket s = ss.accept();
            Webserver e1 = new Webserver(s);
            e1.start();
        }
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            String str = br.readLine();
            String req = str.split(" ")[1];
            String q1[] = req.split("\\?");
            if (q1.length > 1) {
                String kp[] = q1[1].split("&");
                String v1[] = kp[0].split("=");
                String v2[] = kp[1].split("=");
                int res = Integer.parseInt(v1[1]) + Integer.parseInt(v2[1]);
                String s12 = "";
                s12 = "Result=" + res;
                System.out.println(s12);
                FileInputStream fis = new FileInputStream("/home/suneel/Desktop/Data/index.html");
                byte b[] = new byte[fis.available()];
                fis.read(b);
                OutputStream os = s1.getOutputStream();
                os.write("HTTP/1.1 200 OK\r\n".getBytes());
                os.write("Content-type:text/html\r\n".getBytes());
                os.write(("Content-length:" + s12.length() + "\r\n").getBytes());
                os.write("\r\n".getBytes());
                os.write(s12.getBytes());
                os.flush();
            } else {
                FileInputStream fis = new FileInputStream("/home/suneel/Desktop/Data/index.html");
                byte b[] = new byte[fis.available()];
                fis.read(b);
                OutputStream os = s1.getOutputStream();
                os.write("HTTP/1.1 200 OK\r\n".getBytes());
                os.write("Content-type:text/html\r\n".getBytes());
                os.write(("Content-length:" + b.length + "\r\n").getBytes());
                os.write("\r\n".getBytes());
                // os.write(("<html><body><h1>Hello world</h1></body></html>").getBytes());
                os.write(b);
                os.flush();
            }
            // System.in.read();
            s1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
