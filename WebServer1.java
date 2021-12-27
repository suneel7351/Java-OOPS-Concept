import java.io.*;
import java.net.*;

class WebServer1 {
    public static void main(String[] args) {
        try {
            String result = "";
            ServerSocket ss = new ServerSocket(4000);
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str = br.readLine();
            String str1 = str.split(" ")[1];
            String query = str1.split("\\?")[1];
            if (query.length() > 1) {
                String value1 = query.split("&")[0];
                String value2 = query.split("&")[1];
                String Namevalue = value1.split("=")[1];
                String passwordvalue = value2.split("=")[1];

                result = Namevalue + "<br>" + passwordvalue;
            }
            FileInputStream fis = new FileInputStream("/home/suneel/Desktop/Data/index.html");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            OutputStream os = s.getOutputStream();
            os.write(("HTTP/1.1 200 OK\r\n").getBytes());
            os.write(("Content-type:text/html\r\n").getBytes());
            os.write(("Content-length:" + b.length + "\r\n").getBytes());
            os.write(("\r\n").getBytes());
            os.write((result).getBytes());
            os.write(b);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}