import java.awt.*;

class AWTExample {
    AWTExample() {
        Frame f = new Frame("AWT Window");
        Button b = new Button("Click");
        b.setBounds(50, 50, 70, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
