import java.io.*;

class BufferReadWrite {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write("\nsuneel kumar");
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
            // Read by read() method
            int data;
            while ((data = br.read()) != -1) {
                System.out.print((char) data);
            }
            // Read by readLine() method
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
            // Read by Creating an array
            char[] s = new char[20];
            br.read(s, 10, 5);
            System.out.println(s);
            br.close();
            bf.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
