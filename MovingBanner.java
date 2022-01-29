import java.awt.*;

class MovingBanner {
    public static void main(String[] args) {
        myFrame obj = new myFrame("Title");
        obj.setBounds(30, 40, 125, 135);
        obj.setVisible(true);
        MV mv = new MV(obj);
        mv.run();
    }

}

class myFrame extends Frame {
    public String str = "suneel Rajput ";
    public String str2 = "Agra to Kanpur ";

    myFrame(String nm) {
        super(nm);
    }

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        setFont(new Font("SAN_SARIF", Font.BOLD, 100));
        g.drawString(str, 222, 333);
        g.drawString(str2, 222, 444);
    }

}

class MV extends Thread {
    myFrame fr1;

    MV(myFrame fr1) {
        this.fr1 = fr1;
    }

    public void run() {
        while (true) {
            try {
                char ch = fr1.str.charAt(0);
                fr1.str = fr1.str.substring(1, fr1.str.length());
                fr1.str = fr1.str + ch;
                char ch1 = fr1.str2.charAt(0);
                fr1.str2 = fr1.str2.substring(1, fr1.str2.length());
                fr1.str2 = fr1.str2 + ch1;

                fr1.repaint();
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}