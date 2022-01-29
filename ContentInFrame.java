import java.awt.*;
import java.awt.event.*;
import java.io.*;

class ContentInFrame {

    public static void main(String[] args) throws Exception {
        myFrame obj = new myFrame("Title");
        obj.setBounds(30, 40, 125, 135);
        obj.setVisible(true);
    }
}

class myFrame extends Frame {
    public String str = "";
    FileReader fr;
    BufferedReader br;

    myFrame(String nm) {
        super(nm);
        try {
            fr = new FileReader("/home/suneel/Desktop/Data/index.txt");
            br = new BufferedReader(fr);

            // int data;
            String str1;
            while ((str1 = br.readLine()) != null) {
                str = str1 + str;
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void paint(Graphics g) {
        g.drawString(str, 222, 333);
        // repaint();
    }
}