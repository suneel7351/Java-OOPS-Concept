import java.io.*;
import java.net.*;
import java.util.*;

class Networking1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        InetAddress n = InetAddress.getByName("www.google.com");
        InetAddress allName[] = InetAddress.getAllByName("www.google.com");
        System.out.println(address);
        System.out.println(n);
        for (int i = 0; i < allName.length; i++) {
            System.out.println("All Ip of google " + allName[i]);
        }
        try {
            URL url = new URL("https://www.facebook.com/bussiness/news");
            System.out.println(url.getFile());
            System.out.println(url.getPort());
            System.out.println(url.getProtocol());
            System.out.println(url.getPath());
            System.out.println(url.getRef());
            System.out.println(url.getContent());
            System.out.println(url.getQuery());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}