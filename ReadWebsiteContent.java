import java.io.*;
import java.net.*;

class ReadWebsiteContent {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/home/suneel/Desktop/Data/website.html");
            URL url = new URL("http://kanpuruniversityresults.org/");
            URLConnection con = url.openConnection();
            InputStream is = con.getInputStream();
            int data;
            while ((data = is.read()) != -1) {
                fos.write(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}