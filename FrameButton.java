import java.awt.*;

class FrameButton {
    public static void main(String[] args) {
        myFrame f = new myFrame("Title");
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        b1.setBounds(260, 320, 80, 30);
        b2.setBounds(260, 370, 80, 30);
        b3.setBounds(260, 420, 80, 30);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout(null);
        f.setSize(300, 300);
        f.setVisible(true);
    }

}

class myFrame extends Frame {

    myFrame(String nm) {
        super(nm);
    }

    public void paint(Graphics g) {
        g.drawRect(100, 200, 400, 400);
    }

}