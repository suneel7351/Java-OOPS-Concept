import java.io.*;
import java.util.Scanner;

class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the source file");
            String srcFile = sc.nextLine();
            System.out.println("Enter the destination file");
            String destFile = sc.nextLine();
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully");
            fis.close();
            fos.close();
        } catch (Exception e) {

        }
    }
}
