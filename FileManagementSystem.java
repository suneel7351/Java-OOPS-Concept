
import java.io.File;

class FileManagementSystem {
    public static void main(String[] args) {
        File obj = new File("/home/suneel/Desktop/File/");
        System.out.println(obj.getName());
        System.out.println(obj.getParent());
        System.out.println(obj.getPath());
        System.out.println(obj.exists());
        System.out.println(obj.canRead());
        System.out.println(obj.canWrite());
        System.out.println(obj.isDirectory());
        System.out.println(obj.isFile());
        System.out.println(obj.lastModified());
        System.out.println(obj.length());
        File f1 = new File("PQR.txt");
        obj.renameTo(f1);
        System.out.println(f1.getName());
        File f2[] = obj.listFiles();
        int j = 0;
        for (int i = 0; i < f2.length; i++) {
            if (f2[i].isFile()) {
                j++;
            }
        }
        System.out.println(j);
    }
}
