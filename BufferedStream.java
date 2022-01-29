import java.io.*;

class BufferedStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("output.txt");
            fos = new FileOutputStream("output.txt", true);
            BufferedInputStream bfis = new BufferedInputStream(fis);
            BufferedOutputStream bfos = new BufferedOutputStream(fos);
            String st = "\nSuneel Kumar RollNo:188";
            byte[] data = st.getBytes();
            bfos.write(data);
            int data1;
            while ((data1 = bfis.read()) != -1) {
                System.out.print((char) data1);
            }
            bfos.close();
            bfis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}