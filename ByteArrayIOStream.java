import java.io.*;

class ByteArrayIOStream {
    public static void main(String[] args) {
        byte array[] = { 92, 89, 112, 45, 78 };
        ByteArrayInputStream byt = new ByteArrayInputStream(array);
        int k = 0;
        while ((k = byt.read()) != -1) {
            char ch = (char) k;
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }
    }
}
