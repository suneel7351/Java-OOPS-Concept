import java.io.*;

class IOStream {
    public static void main(String[] args) {
        FileInputStream cin = null;
        OutputStream cout = null;
        try {
            cout = new FileOutputStream("demo.txt");
            String s = "demo string";
            byte b[] = s.getBytes();
            cout.write(b);
            cout.flush();
            cout.close();
            cin = new FileInputStream("demo.txt");
            int c;
            while ((c = cin.read()) != -1) {
                System.out.print((char) c);
            }
            cin.close();
        } catch (Exception e) {

        }
    }
}
