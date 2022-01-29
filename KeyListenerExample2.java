import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample2 extends Frame implements KeyListener {
        // Label l;
        // TextArea area;
        TextField t;

        KeyListenerExample2() {
                t = new TextField(300);
                // l = new Label();
                t.setBounds(200, 200, 500, 200);
                // l.setBounds(20, 50, 200, 20);
                // area = new TextArea();
                // area.setBounds(20, 80, 300, 300);
                // area.addKeyListener(this);
                add(t);
                t.addKeyListener(this);
                // add(l);
                // add(area);
                setSize(400, 400);
                setLayout(null);
                setVisible(true);
        }

        // even if we do not define the interface methods, we need to override them
        public void keyPressed(KeyEvent e) {
                String x = t.getText();
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                        t.setText(x.toUpperCase());
        }

        // overriding the keyReleased() method of KeyListener interface
        public void keyReleased(KeyEvent e) {
                // defining a string which is fetched by the getText() method of TextArea class
                // String text = area.getText();
                // splitting the string in words
                // String words[] = text.split("\\s");
                // printing the number of words and characters of the string
                // l.setText("Words: " + words.length + " Characters:" + text.length());
        }

        public void keyTyped(KeyEvent e) {
        }

        public static void main(String[] args) {
                new KeyListenerExample2();
        }
}