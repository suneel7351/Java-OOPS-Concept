import java.io.*;
import java.net.*;
import java.util.*;

class Networking1 {
    // throws UnknownHostException
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.facebook.com:3000/bussiness/news");
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