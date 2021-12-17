import java.awt.*;
import java.awt.event.*;

class AddTwoNumInFrame {
    public static void main(String[] args) {
        myFrame obj = new myFrame("Title");
        obj.setSize(500, 500);
        obj.setVisible(true);
    }
}

class myFrame extends Frame implements ActionListener {
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);

    myFrame(String nm) {
        super(nm);
        setLayout(null);
        t1.setBounds(50, 50, 70, 50);
        t2.setBounds(50, 110, 70, 50);
        add(t1);
        add(t2);
        Button b1 = new Button("Sum");
        b1.setBounds(50, 170, 70, 50);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Sum")) {
            String x = t1.getText();
            String y = t2.getText();
            int v1 = Integer.parseInt(x);
            int v2 = Integer.parseInt(y);
            int result = v1 + v2;
            t1.setText("" + result);
            t2.setText("");
        }
    }
}