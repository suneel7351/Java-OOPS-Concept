import java.awt.*;

class AWT {
    public static void main(String[] args) {
        myFrame obj = new myFrame("Title");
        obj.setBounds(30, 40, 125, 135);
        obj.setVisible(true);
        // MV mv = new MV(obj);
        // mv.run();
    }

}

class myFrame extends Frame {
    public String str = "suneel Rajput";

    myFrame(String nm) {
        super(nm);
    }

    public void paint(Graphics g) {
        // g.setColor(Color.GREEN);
        // setFont(new Font("SAN_SARIF", Font.BOLD, 100));
        // g.drawString(str, 222, 333);
        g.drawLine(100, 200, 200, 100);
        g.drawLine(200, 100, 300, 200);
        g.setColor(Color.BLACK);
        g.fillOval(150, 200, 10, 10);
        g.fillOval(250, 200, 10, 10);
        g.drawArc(100, 100, 200, 200, 0, -180);
        g.fillArc(178, 250, 50, 20, 180, 180);
        g.drawRect(50, 50, 300, 300);
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