import java.io.*;

class FileInput {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("output.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
