import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // 1 Create a frame
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        // 2 Create a panel
        // default layout is FlowLayout
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255,0,0));
        panel.setBackground(Color.BLUE);

        // 3 Create components
        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("Push Me!");
        JTextField textField = new JTextField(5);
        JSpinner spinner = new JSpinner();

        // add an image
        ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);



        // 4 Add components to the panel
        panel.add(picLabel);
        panel.add(label);// label is a child of component there is no add method but panel inhereted
        panel.add(button);
        panel.add(textField);
        panel.add(spinner);



        // 5 Add the panel to the frame
        frame.add(panel);

        // 6 Make the frame visible
        frame.setVisible(true);

    }
}