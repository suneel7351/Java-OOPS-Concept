import java.io.*;

class FileOutput {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("output.txt", true);
            String st = "\nsuneel is a good boy2";
            byte[] data = st.getBytes();
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}