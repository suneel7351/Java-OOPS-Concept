import java.awt.*;

class Joker {
    public static void main(String[] args) {
        myFrame obj = new myFrame("Joker");
        obj.setBounds(30, 40, 125, 135);
        obj.setVisible(true);
    }

}

class myFrame extends Frame {

    myFrame(String nm) {
        super(nm);
    }

    public void paint(Graphics g) {
        g.drawLine(100, 200, 200, 100);
        g.drawLine(200, 100, 300, 200);
        g.drawLine(100, 200, 300, 200);
        g.drawArc(100, 100, 200, 200, 0, -180);
        g.drawLine(135, 225, 155, 225);
        g.drawLine(230, 225, 255, 225);

        g.drawLine(220, 280, 180, 280);

    }

}
