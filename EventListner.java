import java.awt.*;
import java.awt.event.*;

class EventListner extends Frame implements ActionListener {
    Button button;

    EventListner() {
        button = new Button("New Button");
        button.setBounds(90, 140, 100, 40);
        button.addActionListener(this);
        add(button);
        setSize(250, 250);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        button.setLabel("Clicked");
    }

    public static void main(String args[]) {
        new EventListner();
    }
}