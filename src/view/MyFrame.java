package view;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyPanel panel;
    public MyFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 200);
        setVisible(true);
    }

    public void setPanel(MyPanel panel) {
        this.panel = panel;
        add(panel);
    }
}
