import java.awt.*;
import java.awt.event.*;

public class ConverterToCapital extends Frame implements KeyListener {
    TextField t;

    public ConverterToCapital() {
        t = new TextField(400);
        t.setBounds(200, 200, 500, 200);
        add(t);
        t.addKeyListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        String x = t.getText();
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
            t.setText(x.toUpperCase());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new ConverterToCapital();
    }

}