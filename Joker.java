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
        g.setColor(Color.BLACK);
        g.fillOval(150, 200, 10, 10);
        g.fillOval(250, 200, 10, 10);
        g.drawArc(100, 100, 200, 200, 0, -180);
        g.fillArc(178, 250, 50, 20, 180, 180);
        g.drawRect(50, 50, 300, 300);
    }

}
