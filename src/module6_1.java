
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {

    TextField tf;
    Button b;
    Label l;

    MyFrame() {
        setLayout(new FlowLayout());      // Layout manager
        setSize(300, 150);                 // Frame size

        tf = new TextField(10);
        b = new Button("Double");
        l = new Label("Result:");

        add(tf);
        add(b);
        add(l);

        b.addActionListener(this);        // Event registration

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();                // Close window
            }
        });

        setVisible(true);                 // Display frame
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(tf.getText());
        l.setText("Result: " + (n * 2));  // Display output
    }

    public static void module6_1(String[] args) {
        new MyFrame();
    }
}
