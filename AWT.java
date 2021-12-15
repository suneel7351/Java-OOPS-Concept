import java.awt.*;

class AWT {
    public static void main(String[] args) {
        myFrame obj = new myFrame("Title");
        obj.setBounds(30, 40, 125, 135);
        obj.setVisible(true);
        MV mv = new MV(obj);
        mv.run();
    }

}

class myFrame extends Frame {
    public String str = "suneel Rajput";

    myFrame(String nm) {
        super(nm);
    }

    public void paint(Graphics g) {
        // g.drawLine(180, 90, 270, 290);
        // g.drawLine(180, 90, 270, 290);
        // g.drawRect(90, 512, 134, 189);
        // g.fillRect(134, 156, 178, 189);
        // setBackground(Color.RED);
        // g.setColor(Color.GREEN);
        // g.fillOval(400, 300, 100, 100);
        // g.drawOval(450, 450, 100, 100);
        // g.drawArc(300, 200, 300, 300, 0, -180);
        // g.drawLine(600, 200, 300, 300);
        // g.drawLine(180, 290, 5, 300);
        g.setColor(Color.GREEN);
        g.drawString(str, 222, 333);
        setFont(new Font("SAN_SARIF", Font.BOLD, 100));
    }

}

class MV extends Thread {
    myFrame fr1;

    MV(myFrame f) {
        fr1 = f;
    }

    public void run() {
        while (true) {
            try {
                char ch = fr1.str.charAt(0);
                fr1.str = fr1.str.substring(1, fr1.str.length());
                fr1.str = fr1.str + ch;
                fr1.repaint();
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}