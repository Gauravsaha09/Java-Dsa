import javax.swing.*;

class firstgui {
    public static void main(String[] args) {

        // JFrame frame = new JFrame("My First GUI");
        // JLabel label = new JLabel("Hello, This is Java GUI!");
        // JButton button = new JButton("Click Me");

        // frame.setSize(300, 200);
        // frame.setLayout(null);

        // label.setBounds(50, 30, 200, 30);
        // button.setBounds(80, 80, 120, 30);

        // frame.add(label);
        // frame.add(button);

        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JFrame gaurav = new JFrame("GUI Programming"); // Create frame with title
        gaurav.setSize(400, 300);               // Set width & height
        gaurav.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on X
        gaurav.setVisible(true);  
    }
}
